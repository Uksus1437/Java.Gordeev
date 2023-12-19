package lab6.Dish;

public class Mug extends Dish{
    private boolean handle;

    public Mug(String material, double weight, boolean handle) {
        super(material, weight);
        this.handle = handle;
    }

    @Override
    public void use() {
        System.out.println("Пьем из кружки.");
    }

    public boolean hasHandle() {
        return handle;
    }
}
