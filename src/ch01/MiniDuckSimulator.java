package ch01;

import ch01.actionDetail.FlyRocketPowered;
import ch01.duck.Duck;
import ch01.duck.ModelDuck;
import ch01.duck.RedheadDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck redhead = new RedheadDuck();
        redhead.performFly();

        Duck model = new ModelDuck();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
