package lab6.Dish;

public abstract class Dish {
    protected String material;
    protected double weight;

    public Dish(String material, double weight ){
        this.material = material;
        this.weight = weight;
    }

    public abstract void use();

    public String getMaterial() {
        return material;
    }
    public double getWeight() {
        return weight;
    }
}
