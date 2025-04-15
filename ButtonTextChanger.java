import javax.swing.*;
import java.awt.event.*;

public class ButtonTextChanger extends JFrame {
    private JButton button;
    private int clickCount = 0;

    private final String[] messages = {
        "Hello World",
        "Hello Cutie",
        "How are you"
    };

    public ButtonTextChanger() {
        setTitle("Button Text Changer");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton(messages[0]); // Set initial text

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clickCount = (clickCount + 1) % messages.length;
                button.setText(messages[clickCount]);
            }
        });

        add(button);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ButtonTextChanger().setVisible(true);
        });
    }
}
