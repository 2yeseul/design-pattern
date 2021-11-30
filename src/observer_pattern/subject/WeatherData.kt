package observer_pattern.subject

import observer_pattern.observer.Observer
import java.util.ArrayList

class WeatherData : Subject {
    private val observers: MutableList<Observer> = mutableListOf()
    private var temperature = 0f
    private var humidity = 0f
    private var pressure = 0f

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        val index = observers.indexOf(observer)
        if (index >= 0) {
            observers.removeAt(index)
        }
    }

    override fun notifyObservers() {
        for (observer: Observer in observers) {
            observer.update(temperature, humidity, pressure)
        }
    }

    fun measurementsChanged() {
        notifyObservers()
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
    }
}