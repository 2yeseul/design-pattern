package ch01.actionDetail;

import ch01.action.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("로켓 추진으로 날아감");
    }
}
