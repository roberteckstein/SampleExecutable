
// did this work

import menuitems.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.StrokeBorder;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class TextEditor extends JFrame {

    //   This is a comment

    JFrame frame;
    JMenuBar menuBar;
    JTextArea textArea;
    JToolBar toolBar;
    JButton newButton, openButton, saveButton, quitButton, cutButton, copyButton, pasteButton, deleteButton;
    NewProjectMenuItem newProjectMenuItem;
    OpenProjectMenuItem openProjectMenuItem;
    //SaveProjectMenuItem saveProjectMenuItem;
    //QuitMenuItem quitMenuItem;
    CutMenuItem cutMenuItem;
    CopyMenuItem copyMenuItem;
    PasteMenuItem pasteMenuItem;
    //DeleteMenuItem deleteMenuItem;

    // Sandy testing commit.

    public TextEditor() {

        super("Text Editor");
        textArea = new JTextArea();
        toolBar = new JToolBar();

        setJMenuBar(createMenuBar());


        saveButton = new JButton("Save");
        //saveButton.addActionListener(saveProjectMenuItem);
        toolBar.add(saveButton);
        deleteButton = new JButton("Delete");
        //deleteButton.addActionListener(deleteMenuItem);
        toolBar.add(deleteButton);

        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.add(toolBar, BorderLayout.NORTH);
        JPanel textAreaPane = new JPanel();
        textAreaPane.setBorder(new StrokeBorder(new BasicStroke((float)3.0), Color.lightGray));
        textAreaPane.setLayout(new BorderLayout());
        textAreaPane.add(textArea, BorderLayout.CENTER);
        p.add(textAreaPane, BorderLayout.CENTER);
        setContentPane(p);

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
        ImageIcon newImageIcon = new ImageIcon(tk.getImage(iconUrl));
        newProjectMenuItem = new NewProjectMenuItem(newImageIcon, textArea, frame);
        menu.add(newProjectMenuItem);
        newButton = new JButton(newImageIcon);
        newButton.addActionListener(newProjectMenuItem);
        newButton.setToolTipText("Create a new document");
        toolBar.add(newButton);


        // Brian
        iconUrl = this.getClass().getResource("images/Open24.gif");
        ImageIcon openImage = new ImageIcon(tk.getImage(iconUrl));
        openProjectMenuItem = new OpenProjectMenuItem(textArea, frame, openImage);
        menu.add(openProjectMenuItem);
        openButton = new JButton(openImage);
        openButton.addActionListener(openProjectMenuItem);
        openButton.setToolTipText("Open document");
        toolBar.add(openButton);

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
        iconUrl = this.getClass().getResource("images/Cut24.gif");
        ImageIcon cutImage = new ImageIcon(tk.getImage(iconUrl));
        cutMenuItem = new CutMenuItem(textArea, cutImage);
        menu.add(cutMenuItem);
        cutButton = new JButton(cutImage);
        cutButton.addActionListener(cutMenuItem);
        cutButton.setToolTipText("Cut selected text");
        toolBar.add(cutButton);

        //  Ryan
        iconUrl = this.getClass().getResource("images/Copy24.gif");
        ImageIcon copyImage = new ImageIcon(tk.getImage(iconUrl));
        copyMenuItem = new CopyMenuItem(textArea, copyImage);
        menu.add(copyMenuItem);
        copyButton = new JButton(copyImage);
        copyButton.addActionListener(copyMenuItem);
        copyButton.setToolTipText("Copy selected text");
        toolBar.add(copyButton);

        //  Robin
        iconUrl = this.getClass().getResource("images/Paste24.gif");
        ImageIcon pasteImage = new ImageIcon(tk.getImage(iconUrl));
        pasteMenuItem = new PasteMenuItem(textArea, pasteImage);
        menu.add(pasteMenuItem);
        pasteButton = new JButton(pasteImage);
        pasteButton.addActionListener(pasteMenuItem);
        pasteButton.setToolTipText("Paste text from top of clipboard");
        toolBar.add(pasteButton);

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
