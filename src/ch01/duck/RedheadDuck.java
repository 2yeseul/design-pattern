package ch01.duck;

import ch01.actionDetail.FlyWithWings;
import ch01.duck.Duck;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("빨간머리 오리");
    }
}
