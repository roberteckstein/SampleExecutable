/**
 * Brian Quesenberry
 * 2/26/2021
 * SampleExecutable
 */
package menuitems;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class OpenProjectMenuItem extends JMenuItem implements ActionListener {

    JTextArea t;
    JFrame f;

    public OpenProjectMenuItem(JTextArea t, JFrame f, ImageIcon openImage) {

        super("Open", openImage);
        setMnemonic(KeyEvent.VK_P);
        setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, InputEvent.ALT_MASK));
        getAccessibleContext().setAccessibleDescription(
                "Open file");
        addActionListener(this);
        this.t = t;
        this.f = f;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JFileChooser j = new JFileChooser("f:");

        int r = j.showOpenDialog(null);

        if (r == JFileChooser.APPROVE_OPTION) {
            File fi = new File(j.getSelectedFile().getAbsolutePath());

            try {
                String s1;
                StringBuilder sl;

                FileReader fr = new FileReader(fi);
                BufferedReader br = new BufferedReader(fr);
                sl = new StringBuilder(br.readLine());

                while ((s1 = br.readLine()) != null) {
                    sl.append("\n").append(s1);
                }

                t.setText(sl.toString());
            }
            catch (Exception evt) {
                JOptionPane.showMessageDialog(f, evt.getMessage());
            }
        }
        else
            JOptionPane.showMessageDialog(f, "the user cancelled the operation");
    }
}
