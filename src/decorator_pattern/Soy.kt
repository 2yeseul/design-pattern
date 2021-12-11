package decorator_pattern

class Soy(var beverage: Beverage): CondimentDecorator() {
    override var description: String
        get() = beverage.description + ", 두유"
        set(value) {
            super.description = description
        }

    override fun cost(): Double {
        return .15 + beverage.cost()
    }
}