/**
 * Ryan Kirkpatrick
 * 2/25/2021
 * CopyMenuItem
 */

package menuitems;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.URL;

public class CopyMenuItem extends JMenuItem implements ActionListener {

    JTextArea textArea;

    public CopyMenuItem(JTextArea textArea, ImageIcon image) {
        super("Copy", image);

        setMnemonic(KeyEvent.VK_P);
        setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
        getAccessibleContext().setAccessibleDescription("Copy");
        addActionListener(this);
        this.textArea = textArea;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (textArea.getSelectedText() == null){
            JOptionPane.showMessageDialog(null, "No Text Selected To Copy", "Alert", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Nothing copied");
        }else{
            textArea.copy();
            System.out.println("Copied");
        }

    }
}
