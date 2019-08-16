package gui.e006_TextField;

import java.awt.*;
import javax.swing.*;

public class TextFieldJava {
    private TextFieldJava() {
        initUI();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(TextFieldJava::new);
    }

    private void initUI() {
        JFrame mainFrame = new JFrame("TextField Example");
        mainFrame.setSize(512, 512);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel header = new JLabel("JTextField", JLabel.CENTER);
        JLabel status = new JLabel("", JLabel.CENTER);
        status.setSize(128, 128);

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        JLabel name = new JLabel("Name: ", JLabel.RIGHT);
        JLabel age = new JLabel("Age: ", JLabel.CENTER);
        JTextField nameText = new JTextField(6);
        JTextField ageText = new JTextField(6);

        JButton btn = new JButton("Check");
        btn.addActionListener(e -> {
            String data  = "Name: " + nameText.getText();
            data += " Age: " + ageText.getText();
            status.setText(data);
        });

        controlPanel.add(name);
        controlPanel.add(nameText);
        controlPanel.add(age);
        controlPanel.add(ageText);
        controlPanel.add(btn);

        mainFrame.add(header);
        mainFrame.add(controlPanel);
        mainFrame.add(status);
        mainFrame.setVisible(true);
    }
}
