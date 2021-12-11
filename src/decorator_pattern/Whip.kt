package decorator_pattern

class Whip(var beverage: Beverage): CondimentDecorator() {
    override var description: String
        get() = beverage.description + ", 휘핑크림"
        set(value) {
            super.description = description
        }

    override fun cost(): Double {
        return .10 + beverage.cost()
    }
}