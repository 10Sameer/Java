import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class RandomColorChanger extends JFrame {
    private JPanel panel;
    private JButton button;
    private Random random;

    public RandomColorChanger() {
        setTitle("Random Background Color");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        random = new Random();

        panel = new JPanel();
        button = new JButton("Change Color");

        // Add button to panel
        panel.add(button);

        // Add panel to frame
        add(panel);

        // Add ActionListener to button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Generate random RGB values
                int r = random.nextInt(256);
                int g = random.nextInt(256);
                int b = random.nextInt(256);
                Color randomColor = new Color(r, g, b);

                // Set background color
                panel.setBackground(randomColor);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RandomColorChanger().setVisible(true);
        });
    }
}
