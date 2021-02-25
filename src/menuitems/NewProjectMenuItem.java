package menuitems;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.URL;

public class NewProjectMenuItem extends JMenuItem implements ActionListener {

    public NewProjectMenuItem(ImageIcon icon) {

        super("New", icon);
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
