import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChangingButton extends JFrame {
    private JButton button;
    private Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.ORANGE, Color.MAGENTA};
    private int colorIndex = 0;

    public ColorChangingButton() {
        // Set up the JFrame
        setTitle("Button Color Changer");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Initialize button
        button = new JButton("Click me to change color!");
        button.setBackground(colors[colorIndex]);

        // Add action listener
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorIndex = (colorIndex + 1) % colors.length;
                button.setBackground(colors[colorIndex]);
            }
        });

        add(button);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorChangingButton();
    }
}
