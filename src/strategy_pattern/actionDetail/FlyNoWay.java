package strategy_pattern.actionDetail;

import strategy_pattern.action.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날 수 없다");
    }
}
