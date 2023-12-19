package lab8.Shape;
import java.awt.*;
import java.awt.Shape;

public class Circle extends Shape {
    private int radius;

    public Circle(Color color, Point position, int radius) {
        super(color, position);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(position.x, position.y, radius * 2, radius * 2);
    }
}
