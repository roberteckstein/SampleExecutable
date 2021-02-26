package menuitems;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class NewProjectMenuItem extends JMenuItem implements ActionListener {

    JTextArea t;
    JFrame f;

    public NewProjectMenuItem(ImageIcon icon, JTextArea t, JFrame f) {

        super("New", icon);
        setMnemonic(KeyEvent.VK_P);
        setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
        getAccessibleContext().setAccessibleDescription("New File");
        addActionListener(this);
        this.t = t;
        this.f = f;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(f, "clear without saving?");
        t.setText("");
    }
}
