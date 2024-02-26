
public class ObserverPatternExample {

    public static void main(String[] args) {
        // Create observers
        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        // Create subject
        ConcreteSubject subject = new ConcreteSubject();

        // Attach observers to the subject
        subject.addObserver(observer1);
        subject.addObserver(observer2);

        // Perform some action that triggers notification to observers
        subject.doSomething();

        // Detach an observer
        subject.removeObserver(observer1);

        // Perform another action
        subject.doSomething();
    }
}