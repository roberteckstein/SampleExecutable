
// did this work

import menuitems.NewProjectMenuItem;

import javax.swing.*;
import java.awt.event.*;

public class TextEditor extends JFrame {

    JFrame frame;
    JMenuBar menuBar;
    JTextArea textArea;

    public TextEditor() {

        super("Sample Application");
        setJMenuBar(createMenuBar());

        textArea = new JTextArea();
        setContentPane(textArea);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 1000);

    }

    public JMenuBar createMenuBar() {

        JMenuBar menuBar;
        JMenu menu;

        //Create the menu bar.
        menuBar = new JMenuBar();

        //Build the File Menu.
        menu = new JMenu("File");
        menu.setMnemonic(KeyEvent.VK_F);
        menu.getAccessibleContext().setAccessibleDescription("File menu");
        menuBar.add(menu);


        NewProjectMenuItem newProjectMenuItem = new NewProjectMenuItem();
        menu.add(newProjectMenuItem);

        //  To be implemented

        /*
        OpenProjectMenuItem openProjectMenuItem = new OpenProjectMenuItem();
        menu.add(openProjectMenuItem);

        SaveProjectMenuItem saveProjectMenuItem = new SaveProjectMenuItem();
        menu.add(saveProjectMenuItem);

        menu.addSeparator();

        QuitMenuItem quitMenuItem = new QuitMenuItem();
        menu.add(quitMenuItem);
        */

        menu = new JMenu("Edit");
        menu.setMnemonic(KeyEvent.VK_E);
        menu.getAccessibleContext().setAccessibleDescription(
                "Edit Menu");
        menuBar.add(menu);

        /*
        CutMenuItem cutMenuItem = new CutMenuItem();
        menu.add(cutMenuItem);

        CopyMenuItem copyMenuItem = new CopyMenuItem();
        menu.add(copyMenuItem);

        PasteMenuItem pasteMenuItem = new PasteMenuItem();
        menu.add(pasteMenuItem);

        DeleteMenuItem deleteMenuItem = new DeleteMenuItem();
        menu.add(deleteMenuItem);
        */

        return menuBar;

    }

    public static void main(String[] args) {

        TextEditor te = new TextEditor();
        te.setVisible(true);

    }
}
