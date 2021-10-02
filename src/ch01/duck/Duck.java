package ch01.duck;

import ch01.action.FlyBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;

    public Duck() {

    }
    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
}
