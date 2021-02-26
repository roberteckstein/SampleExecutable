/**
 * Ryan Kirkpatrick
 * 2/25/2021
 * CopyMenuItem
 */

package menuitems;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class CopyMenuItem extends JMenuItem implements ActionListener {

    JTextArea textArea;

    public CopyMenuItem(JTextArea textArea) {
        super("Copy", new ImageIcon("images/copy.png"));
        setMnemonic(KeyEvent.VK_P);
        setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
        getAccessibleContext().setAccessibleDescription("Copy");
        addActionListener(this);
        this.textArea = textArea;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (textArea.getSelectedText().equals("")){
            JOptionPane.showMessageDialog(null, "No Text Selected To Copy", "Alert", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Nothing copied");
        }else{
            textArea.copy();
            System.out.println("Copied");
        }

    }
}
