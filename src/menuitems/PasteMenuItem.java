package menuitems;

import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.datatransfer.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;

//paste class: takes contents of the Clipboard and replicates them onto the text area, by Robin
public class PasteMenuItem extends JMenuItem implements ActionListener, ClipboardOwner {
  JTextArea t;

  //Constructor
  public PasteMenuItem(JTextArea textArea, ImageIcon pasteImage) {

    super("Paste", pasteImage);

    t = textArea;

    setMnemonic(KeyEvent.VK_P);
    setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
    getAccessibleContext().setAccessibleDescription("Paste Text");
    addActionListener(this);

  }

  //Pastes text on to text area
  public void actionPerformed(ActionEvent e) {

    try {

      //  Uncomment the following line to test clearing the clipboard manually, then have this class implement ClipboardOwner
      //Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(""), this);

      Transferable t2 = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);

      if (t2 != null && t2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
        t.paste();
      } else {
        JOptionPane.showMessageDialog(null, "Nothing on Clipboard", "Alert" ,JOptionPane.INFORMATION_MESSAGE);
        System.out.println("The clipboard does not have any text on it");
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
  public void lostOwnership(Clipboard clipboard, Transferable contents) {
    //  Do nothing
  }
}