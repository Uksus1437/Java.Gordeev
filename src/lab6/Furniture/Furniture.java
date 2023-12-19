package lab6.Furniture;

public abstract class Furniture {
    private String type;
    private double price;

    public Furniture(String type, double price) {
        this.type = type;
        this.price = price;
    }

    // Абстрактный метод для использования мебели
    public abstract void use();

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}
