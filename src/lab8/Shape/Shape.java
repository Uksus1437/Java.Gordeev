package lab8.Shape;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public abstract class Shape{
    protected Color color;
    protected Point position;

    public Shape(Color color, Point position) {
        this.color = color;
        this.position = position;
    }

    public abstract void draw(Graphics g);
}