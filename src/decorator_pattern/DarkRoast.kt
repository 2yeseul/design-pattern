package decorator_pattern

class DarkRoast: Beverage() {
    init {
        description = "다크 로스트"
    }

    override fun cost(): Double {
        return .99
    }
}