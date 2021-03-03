 /*
  * Andrew Hiser
  * 2/28/2021
  * DeleteMenuItem
  */

 package menuitems;

 import javax.swing.*;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import java.awt.event.KeyEvent;
 public class DeleteMenuItem extends JMenuItem implements ActionListener {
     private JTextArea t;

     public DeleteMenuItem(JTextArea textArea, ImageIcon deleteImage) {
         super("Delete", deleteImage);
         setMnemonic(KeyEvent.VK_P);
         setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
         getAccessibleContext().setAccessibleDescription("Delete");
         addActionListener(this);
         t = textArea;
         System.out.println("Delete Constructor Called");
     }
     @Override

     public void actionPerformed(ActionEvent e) {
         if (t.getSelectedText() != null) {
             t.replaceSelection("");
         } else {
             JOptionPane.showMessageDialog(null, "No text deleted", "Alert", JOptionPane.INFORMATION_MESSAGE);

         }
     }
 }