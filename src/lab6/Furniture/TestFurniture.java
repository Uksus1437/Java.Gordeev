package lab6.Furniture;

public class TestFurniture {
    public static void main(String[] args) {
        Chair chair = new Chair("Деревянный", 50.0, 4);
        chair.use();
        FurnitureShop shop = new FurnitureShop("МебельМаг");
        shop.sellFurniture(chair);
    }
}
