package gui.e003_RadioButton;

import javax.swing.*;
import java.awt.*;
import static java.awt.event.ItemEvent.*;

public class RadioButtonJava {
    private RadioButtonJava() {
        initUI();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(RadioButtonJava::new);
    }

    private void initUI() {
        JFrame mainFrame = new JFrame("Radio Button Example");
        mainFrame.setSize(512, 512);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel header = new JLabel("Radio Button", JLabel.CENTER);
        JLabel status = new JLabel("", JLabel.CENTER);
        status.setSize(480, 128);

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        JRadioButton rBtnJava = new JRadioButton("Java", true);
        JRadioButton rBtnKotlin = new JRadioButton("Kotlin");

        rBtnJava.addItemListener(e -> status.setText(
                "Java: " + (e.getStateChange() == SELECTED ? "Checked" : "Unchecked")
        ));

        rBtnKotlin.addItemListener(e -> status.setText(
                "Kotlin: " + (e.getStateChange() == SELECTED ? "Checked" : "Unchecked")
        ));

        ButtonGroup btnGroup = new ButtonGroup();

        btnGroup.add(rBtnJava);
        btnGroup.add(rBtnKotlin);

        controlPanel.add(rBtnJava);
        controlPanel.add(rBtnKotlin);

        mainFrame.add(header);
        mainFrame.add(controlPanel);
        mainFrame.add(status);
        mainFrame.setVisible(true);
    }
}