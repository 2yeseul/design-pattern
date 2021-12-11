package decorator_pattern

class SteamMilk(var beverage: Beverage): CondimentDecorator() {
    override var description: String
        get() = beverage.description + ", 스팀 밀크"
        set(value) {
            super.description = description
        }

    override fun cost(): Double {
        return .10 + beverage.cost()
    }
}