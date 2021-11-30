package observer_pattern.displayElements

import observer_pattern.observer.Observer
import observer_pattern.subject.Subject

class CurrentConditionsDisplay(private var weatherData: Subject) : Observer, DisplayElement {
    private var temperature: Float = 0.0f
    private var humidity: Float = 0.0f

    init {
        weatherData.registerObserver(this)
    }


    override fun display() {
     println("Current conditions : $temperature F degrees and humidity : $humidity % humidity")
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        display()
    }
}