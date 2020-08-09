package strategy;

public class EatA implements IEatBehavior {
    @Override
    public void eat() {
        System.out.println("eat A");
    }
}
