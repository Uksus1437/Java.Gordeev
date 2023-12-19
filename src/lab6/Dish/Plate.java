package lab6.Dish;

public class Plate extends Dish{
    private int diameter;

    public Plate(String material, double weight, int diameter) {
        super(material, weight);
        this.diameter = diameter;
    }

    @Override
    public void use() {
        System.out.println("Используем тарелку для еды.");
    }

    public int getDiameter() {
        return diameter;
    }
}
