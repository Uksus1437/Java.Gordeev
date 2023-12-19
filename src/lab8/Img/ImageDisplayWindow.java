package lab8.Img;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class ImageDisplayWindow extends JFrame{
    public ImageDisplayWindow(String imagePath) {
        setTitle("Image Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            BufferedImage image = ImageIO.read(new File(imagePath));
            ImageIcon imageIcon = new ImageIcon(image);
            JLabel label = new JLabel(imageIcon);

            getContentPane().add(label);
            pack();
            setLocationRelativeTo(null);
            setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ошибка при загрузке изображения.");
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Использование: java ImageDisplayWindow.java <путь к изображению>");
            System.exit(1);
        }

        String imagePath = args[0];

        SwingUtilities.invokeLater(() -> {
            new ImageDisplayWindow(imagePath);
        });
    }
}
