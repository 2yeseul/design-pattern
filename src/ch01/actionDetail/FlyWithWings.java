package ch01.actionDetail;

import ch01.action.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날 수 있다.");
    }
}
