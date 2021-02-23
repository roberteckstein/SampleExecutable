package menuitems;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class NewProjectMenuItem extends JMenuItem implements ActionListener {

    public NewProjectMenuItem() {

        super("New", new ImageIcon("images/newproject.png"));
        setMnemonic(KeyEvent.VK_P);
        setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
        getAccessibleContext().setAccessibleDescription(
                "New File");
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("New Action is performed");
    }
}
