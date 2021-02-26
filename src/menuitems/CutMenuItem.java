package menuitems;

import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class CutMenuItem extends JMenuItem implements ActionListener {
  JTextArea t;

  public CutMenuItem() {

  }

  public CutMenuItem(JTextArea k, ImageIcon cutImage) {
    super("Cut", cutImage);
    setMnemonic(KeyEvent.VK_X);
    setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
    getAccessibleContext().setAccessibleDescription("Cut Text");
    addActionListener(this);
    t = k;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    
    if (t.getSelectedText() == null){
      JOptionPane.showMessageDialog(null, "No Text Selected", "Alert", JOptionPane.INFORMATION_MESSAGE);
      System.out.println("Nothing selected");
      
    }else{

      t.cut();
      System.out.println("Cut Action is performed");

    }

    
  }
}