package observer_pattern.observer

// Subscriber
interface Observer {
    fun update(temp: Float, humidity: Float, pressure: Float)
}