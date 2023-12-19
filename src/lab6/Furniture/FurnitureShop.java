package lab6.Furniture;

public class FurnitureShop {
    private String name;

    public FurnitureShop(String name) {
        this.name = name;
    }

    public void sellFurniture(Furniture furniture) {
        System.out.println("Продаем мебель типа: " + furniture.getType() + " за " + furniture.getPrice() + '$');
    }
}
