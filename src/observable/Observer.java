package observable;

public class Observer implements IObserver {
    String name="";

    public Observer(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("something happens");
    }
}
