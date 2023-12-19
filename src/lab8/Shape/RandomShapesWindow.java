package lab8.Shape;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class RandomShapesWindow extends JFrame{
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;
    private static final int NUM_SHAPES = 20;

    public RandomShapesWindow() {
        setTitle("Random Shapes");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Random random = new Random();
                for (int i = 0; i < NUM_SHAPES; i++) {
                    int x = random.nextInt(WINDOW_WIDTH);
                    int y = random.nextInt(WINDOW_HEIGHT);
                    int width = random.nextInt(100) + 20;
                    int height = random.nextInt(100) + 20;
                    Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
                    Shape shape;
                    if (random.nextBoolean()) {
                        shape = new Rectangle(color, new Point(x, y), width, height);
                    } else {
                        int radius = Math.min(width, height) / 2;
                        shape = new Circle(color, new Point(x, y), radius);
                    }
                    shape.draw(g);
                }
            }
        };
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RandomShapesWindow();
        });
    }

}