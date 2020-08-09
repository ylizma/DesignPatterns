package decorator;

/*
* Decorator design pattern is used to modify the functionality of an object at runtime.
* At the same time other instances of the same class will not be affected by this, so individual object gets the modified behavior.
* Decorator design pattern is one of the structural design pattern (such as Adapter Pattern, Bridge Pattern, Composite Pattern)
* and uses abstract classes or interface with composition to implement
*/

public class CarDecortor implements Car {

    Car car;

    public CarDecortor(Car car) {
        this.car = car;
    }

    @Override
    public void description() {
        this.car.description();
    }
}
