import BuilderPattern.Computer;
import FactoryMethodPattern.Animal;
import FactoryMethodPattern.AnimalFactory;
import ObserverPattern.Observer;
import ObserverPattern.Publisher;
import ObserverPattern.Subscriber;
import SingletonPattern.Singleton;
import StrategyPattern.CreditCardPayment;
import StrategyPattern.PayPalPayment;
import StrategyPattern.PaymentContext;

public class Main {
    public static void main(String[] args) {
        // Singleton
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        // Factory Method
        Animal dog = AnimalFactory.getAnimal("dog");
        dog.speak();

        Animal cat = AnimalFactory.getAnimal("cat");
        cat.speak();

        // Builder
        Computer computer = new Computer.Builder()
                .setCPU("Intel i7")
                .setGPU("NVIDIA RTX 3080")
                .setRAM(16)
                .build();
        System.out.println(computer);

        // Observer
        Publisher publisher = new Publisher();
        Observer sub1 = new Subscriber("Alice");
        Observer sub2 = new Subscriber("Bob");

        publisher.subscribe(sub1);
        publisher.subscribe(sub2);

        publisher.notifyObservers("New content available!");

        // Strategy
        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPaymentStrategy(new CreditCardPayment());
        paymentContext.executePayment(100);

        paymentContext.setPaymentStrategy(new PayPalPayment());
        paymentContext.executePayment(200);
    }
}
