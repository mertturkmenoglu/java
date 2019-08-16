package gui.e004_List;

import javax.swing.*;
import java.awt.*;

public class ListJava {
    private ListJava() {
        initUI();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(ListJava::new);
    }

    private void initUI() {
        JFrame mainFrame = new JFrame("List Example");
        mainFrame.setSize(512, 512);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel header = new JLabel("JList Example", JLabel.CENTER);
        JLabel status = new JLabel("", JLabel.CENTER);
        status.setSize(128, 128);

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        DefaultListModel<String> studentsName = new DefaultListModel<>();
        studentsName.addElement("Emily");
        studentsName.addElement("Diana");
        studentsName.addElement("Barbara");
        studentsName.addElement("Selina");

        JList<String> studentList = new JList<>(studentsName);
        studentList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        studentList.setSelectedIndex(0);
        studentList.setVisibleRowCount(4);

        JScrollPane studentListScrollPane = new JScrollPane(studentList);

        DefaultListModel<String> items = new DefaultListModel<>();
        items.addElement("Book");
        items.addElement("Pen");
        items.addElement("Ruler");
        items.addElement("Notebook");

        JList<String> itemList = new JList<>(items);
        itemList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        itemList.setSelectedIndex(0);
        itemList.setVisibleRowCount(3);

        JScrollPane itemListScrollPane = new JScrollPane(itemList);

        JButton show = new JButton("Show");
        show.addActionListener(e -> {
            StringBuilder data = new StringBuilder();
            if (studentList.getSelectedIndex() != -1) {
                data = new StringBuilder("Student: " + studentList.getSelectedValue());
                status.setText(data.toString());
            }
            if (itemList.getSelectedIndex() != -1) {
                data.append(" Items: ");
                for (Object id1 : itemList.getSelectedValuesList()) {
                    data.append(id1).append(" ");
                }
            }
            status.setText(data.toString());
        });

        controlPanel.add(studentListScrollPane);
        controlPanel.add(itemListScrollPane);
        controlPanel.add(show);
        mainFrame.add(header);
        mainFrame.add(controlPanel);
        mainFrame.add(status);
        mainFrame.setVisible(true);
    }
}