import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;

//paste class: takes contents of the Clipboard and replicates them onto the text area, by Robin
public class PasteMenuItem extends JMenuItem implements ActionListener {
  JTextArea t;

  //Constructor
  public PasteMenuItem(JTextArea textArea) {
    super("Paste", new ImageIcon("images/newproject.png")); 
    setMnemonic(KeyEvent.VK_P);
    setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
    getAccessibleContext().setAccessibleDescription("Paste Text");
    addActionListener(this);
    t = textArea;
  }
  @Override

  //Pastes text on to text area
  public void actionPerformed(ActionEvent e) {
    t.paste()

    System.out.println("New Action is performed");
  }
}