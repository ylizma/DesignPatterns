package decorator;



public class ClassicCar extends CarDecortor {

    public ClassicCar(Car car) {
        super(car);
    }

    @Override
    public void description() {
        super.description();
        System.out.println("classic car");
    }
}
