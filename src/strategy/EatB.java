package strategy;

public class EatB implements IEatBehavior {
    @Override
    public void eat() {
        System.out.println("eat B");
    }
}
