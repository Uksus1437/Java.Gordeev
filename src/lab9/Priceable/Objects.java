package lab9.Priceable;

class Book implements Priceable {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

class Car implements Priceable {
    private String brand;
    private double price;

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

class Phone implements Priceable {
    private String model;
    private double price;

    public Phone(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}