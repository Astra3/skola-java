package gui.beginning;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JPanel MainPanel;
    private JButton button1;
    private JLabel NadpisLabel;

    public MainForm() {
        InitListeners();
    }

    private void InitListeners() {
        button1.addActionListener(new Button_click());
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Super aplikace");
        frame.setContentPane(new MainForm().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private class Button_click implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            NadpisLabel.setText("Došlo ke stisku tlačítka");
        }
    }
}
