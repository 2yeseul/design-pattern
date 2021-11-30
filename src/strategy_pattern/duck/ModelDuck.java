package strategy_pattern.duck;

import strategy_pattern.actionDetail.FlyNoWay;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println("모형 오리 입니다.");
    }
}
