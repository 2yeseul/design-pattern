package decorator_pattern

class Decaf: Beverage() {
    init {
        description = "๋์นดํ์ธ"
    }

    override fun cost(): Double {
        return 1.05
    }
}