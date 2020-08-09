package decorator;

public class Test
{
    public static void main(String[] args) {
        Car car = new CarDecortor(new ClassicCar(new BasicCar()));
        car.description();
    }
}
