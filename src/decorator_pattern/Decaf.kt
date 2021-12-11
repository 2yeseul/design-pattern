package decorator_pattern

class Decaf: Beverage() {
    init {
        description = "디카페인"
    }

    override fun cost(): Double {
        return 1.05
    }
}