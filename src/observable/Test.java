package observable;

public class Test {
    public static void main(String[] args) {

        IObservable observable = new Observable();
        IObserver observer1 = new Observer("obs1");
        IObserver observer2 = new Observer("obs2");
        IObserver observer3 = new Observer("obs3");
        observable.add(observer1);
        observable.add(observer2);
        observable.add(observer3);
        observable.notifyObservers();
    }
}
