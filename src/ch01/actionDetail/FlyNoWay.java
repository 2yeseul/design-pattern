package ch01.actionDetail;

import ch01.action.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날 수 없다");
    }
}
