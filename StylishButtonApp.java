import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class StylishButtonApp extends JFrame {
    private JButton button;
    private int clickCount = 0;
    private final String[] messages = {
        "Hello World",
        "Hello Cutie",
        "How are you"
    };
    private Random random;

    public StylishButtonApp() {
        setTitle("Stylish Button App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout()); // Center the button

        random = new Random();

        button = new JButton(messages[0]);
        button.setFont(new Font("Arial", Font.BOLD, 18));
        button.setForeground(Color.WHITE);
        button.setBackground(new Color(70, 130, 180)); // Steel blue
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
        button.setPreferredSize(new Dimension(200, 50));

      
