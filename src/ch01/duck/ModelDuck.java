package ch01.duck;

import ch01.actionDetail.FlyNoWay;
import ch01.duck.Duck;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println("모형 오리 입니다.");
    }
}
