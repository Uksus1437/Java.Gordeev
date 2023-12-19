package lab6.Furniture;

public class Chair extends Furniture{
    private int numberOfLegs;

    public Chair(String type, double price, int numberOfLegs) {
        super(type, price);
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void use() {
        System.out.println("Сидим на стуле.");
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }
}
