package lab9.Nameable;

public class NameableExample {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth");
        Animal lion = new Animal("Lion");
        Car bmw = new Car("BMW X5");

        System.out.println("Planet name: " + earth.getName());
        System.out.println("Animal name: " + lion.getName());
        System.out.println("Car name: " + bmw.getName());
    }
}
