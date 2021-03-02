/**
 * Josh Henninger
 * 3/1/21
 * SampleExecutable
 */
package menuitems;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.File;

public class SaveProjectMenuItem extends JMenuItem implements ActionListener {

    JTextArea t;
    JFrame f;

    public SaveProjectMenuItem(JTextArea t, JFrame f, ImageIcon saveImage) {
        super("Save", saveImage);
        setMnemonic(KeyEvent.VK_P);
        setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_7, InputEvent.ALT_MASK));
        getAccessibleContext().setAccessibleDescription("Save file");
        addActionListener(this);

        this.t = t;
        this.f = f;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser s = new JFileChooser("f: ");
        int r = s.showSaveDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) {
            File file = s.getSelectedFile();
            file = new File(file.getParentFile(), file.getName() + ".txt");
            try {
                t.write(new OutputStreamWriter(new FileOutputStream(file), "utf-8"));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(f, "save cancelled");
        }
    }
}
