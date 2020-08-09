package decorator2;

public  abstract class CondimentDecorator extends Beverage {
    @Override
    double cost() {
        return 0;
    }
}
