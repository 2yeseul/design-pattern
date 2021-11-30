package observer_pattern.subject

import observer_pattern.observer.Observer

// Publisher
interface Subject {
    fun registerObserver(observer: Observer)
    fun removeObserver(observer: Observer)
    fun notifyObservers()
}