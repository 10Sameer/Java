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

    