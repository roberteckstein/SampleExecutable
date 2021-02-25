
import menuitems.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextEditor extends JFrame {

    JFrame frame;
    JMenuBar menuBar;
    JTextArea textArea = new JTextArea();
    JToolBar toolBar;
    JButton newButton, openButton, saveButton, quitButton, cutButton, copyButton, pasteButton, deleteButton;
    NewProjectMenuItem newProjectMenuItem;
    OpenProjectMenuItem openProjectMenuItem;
    SaveProjectMenuItem saveProjectMenuItem;
    QuitMenuItem quitMenuItem;
    CutMenuItem cutMenuItem;
    CopyMenuItem copyMenuItem;
    PasteMenuItem pasteMenuItem;
    DeleteMenuItem deleteMenuItem;


    public TextEditor() {

        super("Sample Application");
        setJMenuBar(createMenuBar());

        toolBar = new JToolBar();

        newButton = new JButton("New");
        newButton.addActionListener(newProjectMenuItem);
        toolBar.add(newButton);
        openButton = new JButton("Open");
        openButton.addActionListener(openProjectMenuItem);
        toolBar.add(openButton);
        saveButton = new JButton("Save");
        saveButton.addActionListener(saveProjectMenuItem);
        toolBar.add(saveButton);
        quitButton = new JButton("Quit");
        quitButton.addActionListener(quitMenuItem);
        toolBar.add(quitButton);
        toolBar.addSeparator();
        cutButton = new JButton("Cut");
        cutButton.addActionListener(cutMenuItem);
        toolBar.add(cutButton);
        copyButton = new JButton("Copy");
        copyButton.addActionListener(copyMenuItem);
        toolBar.add(copyButton);
        pasteButton = new JButton("Paste");
        pasteButton.addActionListener(pasteMenuItem);
        toolBar.add(pasteButton);
        deleteButton = new JButton("Delete");
        deleteButton.addActionListener(deleteMenuItem);
        toolBar.add(deleteButton);

        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.add(toolBar, BorderLayout.NORTH);
        p.add(textArea, BorderLayout.CENTER);
        setContentPane(textArea);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 1000);

    }

    public JMenuBar createMenuBar() {

        JMenuBar menuBar;
        JMenu menu;

        // Hayden will add the Tool Bar

        //Create the menu bar.
        menuBar = new JMenuBar();

        //Build the File Menu.
        menu = new JMenu("File");
        menu.setMnemonic(KeyEvent.VK_F);
        menu.getAccessibleContext().setAccessibleDescription("File menu");
        menuBar.add(menu);


        //  Chris
        NewProjectMenuItem newProjectMenuItem = new NewProjectMenuItem();
        menu.add(newProjectMenuItem);

        //  To be implemented

        // Brian
        OpenProjectMenuItem openProjectMenuItem = new OpenProjectMenuItem();
        menu.add(openProjectMenuItem);

        // Joshua H
        SaveProjectMenuItem saveProjectMenuItem = new SaveProjectMenuItem();
        menu.add(saveProjectMenuItem);

        menu.addSeparator();

        //  Kasen BG
        QuitMenuItem quitMenuItem = new QuitMenuItem();
        menu.add(quitMenuItem);

        menu = new JMenu("Edit");
        menu.setMnemonic(KeyEvent.VK_E);
        menu.getAccessibleContext().setAccessibleDescription(
                "Edit Menu");
        menuBar.add(menu);


        //  Sandy
        CutMenuItem cutMenuItem = new CutMenuItem(this.textArea);
        menu.add(cutMenuItem);

        //  Ryan
        CopyMenuItem copyMenuItem = new CopyMenuItem();
        menu.add(copyMenuItem);

        //  Robin
        PasteMenuItem pasteMenuItem = new PasteMenuItem();
        menu.add(pasteMenuItem);

        //  Andrew
        DeleteMenuItem deleteMenuItem = new DeleteMenuItem();
        menu.add(deleteMenuItem);

        return menuBar;

    }

    public static void main(String[] args) {

        TextEditor te = new TextEditor();
        te.setVisible(true);

    }
}
