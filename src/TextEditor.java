
// did this work

import menuitems.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class TextEditor extends JFrame {

    //   This is a comment

    JFrame frame;
    JMenuBar menuBar;
    JTextArea textArea = new JTextArea();

    // Sandy testing commit.

    public TextEditor() {

        super("Sample Application");
        setJMenuBar(createMenuBar());

        setContentPane(textArea);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 1000);

    }

    public JMenuBar createMenuBar() {

        JMenuBar menuBar;
        JMenu menu;
        Toolkit tk = this.getToolkit();

        // Hayden will add the Tool Bar

        //Create the menu bar.
        menuBar = new JMenuBar();

        //Build the File Menu.
        menu = new JMenu("File");
        menu.setMnemonic(KeyEvent.VK_F);
        menu.getAccessibleContext().setAccessibleDescription("File menu");
        menuBar.add(menu);


        //  Chris
        URL iconUrl = this.getClass().getResource("images/New24.gif");
        Image someimgicon = tk.getImage(iconUrl);
        NewProjectMenuItem newProjectMenuItem = new NewProjectMenuItem(new ImageIcon(someimgicon));
        menu.add(newProjectMenuItem);

        // Brian
        OpenProjectMenuItem openProjectMenuItem = new OpenProjectMenuItem(textArea, frame);
        menu.add(openProjectMenuItem);

        //  To be implemented

        /*

        // Joshua H
        SaveProjectMenuItem saveProjectMenuItem = new SaveProjectMenuItem();
        menu.add(saveProjectMenuItem);

        menu.addSeparator();

        //  Kasen BG
        QuitMenuItem quitMenuItem = new QuitMenuItem();
        menu.add(quitMenuItem);
        */

        menu = new JMenu("Edit");
        menu.setMnemonic(KeyEvent.VK_E);
        menu.getAccessibleContext().setAccessibleDescription(
                "Edit Menu");
        menuBar.add(menu);


        //  Sandy
         CutMenuItem cutMenuItem = new CutMenuItem(textArea);
         menu.add(cutMenuItem);

        //  Ryan
        iconUrl = this.getClass().getResource("images/Copy24.gif");
        Image copyImage = tk.getImage(iconUrl);
        CopyMenuItem copyMenuItem = new CopyMenuItem(textArea, new ImageIcon(copyImage));
        menu.add(copyMenuItem);

        //  Robin
        PasteMenuItem pasteMenuItem = new PasteMenuItem(textArea);
        menu.add(pasteMenuItem);

        //  Andrew
        // DeleteMenuItem deleteMenuItem = new DeleteMenuItem();
        // menu.add(deleteMenuItem);

        return menuBar;

    }

    public static void main(String[] args) {

        TextEditor te = new TextEditor();
        te.setVisible(true);

    }
}
