package decorator2;

public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    double cost() {
        return 0.20+beverage.cost();
    }
}
