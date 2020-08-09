package decorator;

public class BasicCar implements Car {
    @Override
    public void description() {
        System.out.println("basic car");
    }
}
