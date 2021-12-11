package decorator_pattern

abstract class Beverage {
    open var description: String = "No Title"

    abstract fun cost(): Double
}