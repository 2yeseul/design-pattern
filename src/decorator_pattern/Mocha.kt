package decorator_pattern

import decorator_pattern.Beverage
import decorator_pattern.CondimentDecorator

class Mocha(var beverage: Beverage) : CondimentDecorator() {
    override var description: String
        get() = beverage.description + ", 모카"
        set(description) {
            super.description = description
        }

    override fun cost(): Double {
        return .20 + beverage.cost()
    }
}