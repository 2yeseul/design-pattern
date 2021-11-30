package strategy_pattern.duck;

import strategy_pattern.actionDetail.FlyWithWings;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("빨간머리 오리");
    }
}
