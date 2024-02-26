import java.util.ArrayList;
import java.util.List;

class ConcreteSubject implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // Some business logic that changes the state and notifies observers
    public void doSomething() {
        // ... (some business logic)
        notifyObservers("State changed!");
    }
}