package lab6.Dish;

public class TestDish {
    public static void main(String[] args) {
        Plate plate = new Plate("Керамика", 0.5, 20);
        Mug mug = new Mug("Порцелян", 0.3, true);
        plate.use();
        mug.use();
    }
}
