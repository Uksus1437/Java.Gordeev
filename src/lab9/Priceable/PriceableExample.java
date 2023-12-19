package lab9.Priceable;

public class PriceableExample {
    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby", 15.99);
        Car car = new Car("Toyota Camry", 25000.0);
        Phone phone = new Phone("iPhone 12", 799.0);

        System.out.println("Book price: $" + book.getPrice());
        System.out.println("Car price: $" + car.getPrice());
        System.out.println("Phone price: $" + phone.getPrice());
    }
}