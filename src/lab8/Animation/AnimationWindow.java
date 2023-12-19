package lab8.Animation;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Thread;

public class AnimationWindow extends JFrame {
    private static final int WINDOW_WIDTH = 1920;
    private static final int WINDOW_HEIGHT = 1080;
    private static final int FRAME_DELAY = 100;

    private ImageIcon[] frames;
    private int currentFrameIndex = 0;
    private JLabel animationLabel;

    public AnimationWindow(ImageIcon[] frames) {
        setTitle("Анимация");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.frames = frames;
        animationLabel = new JLabel(frames[0]);

        add(animationLabel, BorderLayout.CENTER);

        Timer timer = new Timer(FRAME_DELAY, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
                currentFrameIndex = (currentFrameIndex + 1) % frames.length;
                animationLabel.setIcon(frames[currentFrameIndex]);
            }
        });
        timer.start();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ImageIcon[] frames = new ImageIcon[3];
            frames[0] = new ImageIcon("src/Animation/frame1.png");
            frames[1] = new ImageIcon("src/Animation/frame2.png");
            frames[2] = new ImageIcon("src/Animation/frame3.png");

            new AnimationWindow(frames);
        });
    }
}