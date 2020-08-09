package strategy;

public class FlyA implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("fly A");
    }
}
