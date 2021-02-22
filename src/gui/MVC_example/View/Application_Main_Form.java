package gui.MVC_example.View;

import javax.swing.*;

public class Application_Main_Form extends JFrame {
    private JPanel MainPanel;
    private JLabel de_label;
    private JButton ok_hand_button;

    public Application_Main_Form() {
        setSize(640, 480);
        setResizable(false);
        setTitle("Java aplikace LOOOOOOOL");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setContentPane(MainPanel);
        Component_creating();
        Add_component_into_frame();
    }
    private void Component_creating() {
        ok_hand_button = new JButton();
        ok_hand_button.setText("OK");
    }
    private void Add_component_into_frame() {
        ok_hand_button = new JButton();
        ok_hand_button.setText("OK");
    }
}
