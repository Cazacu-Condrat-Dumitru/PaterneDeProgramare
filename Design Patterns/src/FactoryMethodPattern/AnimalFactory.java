package FactoryMethodPattern;

public class AnimalFactory {
    public static Animal getAnimal(String type) {
        return switch (type.toLowerCase()) {
            case "dog" -> new Dog();
            case "cat" -> new Cat();
            default -> throw new IllegalArgumentException("Unknown animal type");
        };
    }
}
