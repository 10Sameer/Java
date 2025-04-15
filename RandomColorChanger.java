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
       