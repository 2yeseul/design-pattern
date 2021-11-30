package strategy_pattern.actionDetail;

import strategy_pattern.action.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날 수 있다.");
    }
}
