package decorator_pattern

import kotlin.jvm.JvmStatic

object StarbucksCoffee {
    @JvmStatic
    fun main(args: Array<String>) {
        val espresso: Beverage = Espresso()
        println("${espresso.description} $ ${espresso.cost()}")

        var darkRoast: Beverage = DarkRoast()
        darkRoast = Mocha(darkRoast)
        darkRoast = Mocha(darkRoast)
        darkRoast = Whip(darkRoast)
        println("${darkRoast.description} $ ${darkRoast.cost()}")

        var houseBlend: Beverage = HouseBlend()
        houseBlend = Soy(houseBlend)
        houseBlend = Mocha(houseBlend)
        houseBlend = Whip(houseBlend)
        println("${houseBlend.description} $ ${houseBlend.cost()}")
    }
}