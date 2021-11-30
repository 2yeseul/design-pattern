package strategy_pattern;

import strategy_pattern.actionDetail.FlyRocketPowered;
import strategy_pattern.duck.Duck;
import strategy_pattern.duck.ModelDuck;
import strategy_pattern.duck.RedheadDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck redhead = new RedheadDuck();
        redhead.performFly();

        Duck model = new ModelDuck();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
