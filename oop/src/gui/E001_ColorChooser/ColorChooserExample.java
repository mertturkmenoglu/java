package gui.E001_ColorChooser;

import javax.swing.*;
import java.awt.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class ColorChooserExample {
    private ColorChooserExample(){
        initUI();
    }

    public static void main(String[] args){
        EventQueue.invokeLater(ColorChooserExample::new);
    }

    private void initUI(){
        JFrame mainFrame = new JFrame("Color Chooser Example Examples");
        mainFrame.setSize(512,512);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel headerLabel = new JLabel("JColorChooser Example", JLabel.CENTER);

        JLabel statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(256,128);

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        JButton chooseButton = new JButton("Choose Background");
        chooseButton.addActionListener(e -> {
            Color backgroundColor = JColorChooser.showDialog(mainFrame,
                    "Choose background color", Color.white);
            if(backgroundColor != null){
                controlPanel.setBackground(backgroundColor);
                mainFrame.getContentPane().setBackground(backgroundColor);
            }
        });

        controlPanel.add(chooseButton);

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }
}
