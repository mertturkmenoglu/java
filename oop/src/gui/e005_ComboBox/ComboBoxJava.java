package gui.e005_ComboBox;

import javax.swing.*;
import java.awt.*;

public class ComboBoxJava {
    private ComboBoxJava() {
        initUI();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(ComboBoxJava::new);
    }

    private void initUI() {
        JFrame mainFrame = new JFrame("ComboBox Example");
        mainFrame.setSize(512, 512);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel header = new JLabel("JComboBox", JLabel.CENTER);
        JLabel status = new JLabel("", JLabel.CENTER);
        status.setSize(128, 128);

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        DefaultComboBoxModel<String> names = new DefaultComboBoxModel<>();
        names.addElement("Emily");
        names.addElement("Diana");
        names.addElement("Barbara");
        names.addElement("Selina");

        JComboBox<String> namesCombo = new JComboBox<>(names);
        namesCombo.setSelectedIndex(0);

        JScrollPane namesScrollPane = new JScrollPane(namesCombo);
        JButton showBtn = new JButton("Show");

        showBtn.addActionListener(e -> {
            String data = "";
            if (namesCombo.getSelectedIndex() != -1) {
                data = "Selected: " + namesCombo.getSelectedItem();
            }
            status.setText(data);
        });

        controlPanel.add(namesScrollPane);
        controlPanel.add(showBtn);

        mainFrame.add(header);
        mainFrame.add(controlPanel);
        mainFrame.add(status);
        mainFrame.setVisible(true);
    }
}
