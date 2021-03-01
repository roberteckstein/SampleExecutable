/**
 * Kasen BjuganGreen
 * 2/25/2021
 * QuitMenuItem
 */

package menuitems;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


public class QuitMenuItem extends JMenuItem implements ActionListener {

    JFrame frame;

    private void confirmQuit() {
        int result = JOptionPane.showConfirmDialog(frame,"Are you sure you want to exit?", "Quit Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if(result == JOptionPane.YES_OPTION){
            System.exit(0);
        }else {
            return;
        }
    }

    public QuitMenuItem() {
        super("Quit");
        setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_6, ActionEvent.ALT_MASK));
        getAccessibleContext().setAccessibleDescription("Exit Program");
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        confirmQuit();
    }
}
