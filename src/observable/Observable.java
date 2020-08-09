package observable;

import java.util.ArrayList;
import java.util.List;

public class Observable implements IObservable {
    private List<IObserver> observersList = new ArrayList<>();

    @Override
    public void add(IObserver observer) {
        this.observersList.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        this.observersList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : this.observersList
        ) {
            observer.update();
        }
    }
}
