package gui.e002_CheckBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;

public class CheckBoxJava {
    private CheckBoxJava() {
        initUI();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(CheckBoxJava::new);
    }

    private void initUI() {
        JFrame mainFrame = new JFrame("CheckBox Example");
        mainFrame.setSize(512, 512);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel header = new JLabel("Checkbox", JLabel.CENTER);
        JLabel status = new JLabel("", JLabel.CENTER);
        status.setSize(256, 128);

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        JCheckBox cboxJava = new JCheckBox("Java");
        JCheckBox cboxKotlin = new JCheckBox("Kotlin");

        cboxJava.addItemListener(e -> status.setText("JAVA "+
                (e.getStateChange() == ItemEvent.SELECTED ? "CHECKED" : "UNCHECKED")));
        cboxKotlin.addItemListener(e -> status.setText("KOTLIN " +
                (e.getStateChange() == ItemEvent.SELECTED ? "CHECKED" : "UNCHECKED")));

        controlPanel.add(cboxJava);
        controlPanel.add(cboxKotlin);

        mainFrame.add(header);
        mainFrame.add(controlPanel);
        mainFrame.add(status);
        mainFrame.setVisible(true);
    }
}