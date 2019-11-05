import Modules.Card;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * This class is responsible for setting a graphical user interface
 * that shows the deck and cards on each deck.
 */
public class GUI {

    public static int deckNr = 1;
    public JFrame deck = new JFrame("Deck# " + deckNr);
    public JScrollPane jscrollPane;
    public JPanel contentPanel = new JPanel();
    public JPanel buttonPanel = new JPanel();
    public JButton drawBtn = new JButton("Draw");
    public JButton sortBtn = new JButton("Sort");
    public JButton shuffleBtn = new JButton("Shuffle");
    public JButton clearBtn = new JButton("Clear");
    public JMenuBar menuBar = new JMenuBar();
    public JMenu menu = new JMenu("Options");
    public JMenuItem newDeck = new JMenuItem("New Deck");
    public JMenuItem exit = new JMenuItem("Exit");

    /**
     * Constructor setting panels and buttons in deck
     */
    public GUI() {

        deck.setVisible(true);
        deck.setPreferredSize(new Dimension(900, 740));

        contentPanel.setLayout(new GridLayout(4, 13, 0, 0));

        jscrollPane = new JScrollPane(contentPanel);
        jscrollPane.setPreferredSize(new Dimension(600, 500));
        jscrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jscrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jscrollPane.setVisible(true);

        // Setting button size
        drawBtn.setSize(10, 10);
        sortBtn.setSize(10, 10);
        shuffleBtn.setSize(10, 10);
        clearBtn.setSize(10, 10);

        //adding buttons to the panel
        buttonPanel.add(drawBtn, BorderLayout.AFTER_LAST_LINE);
        buttonPanel.add(sortBtn, BorderLayout.AFTER_LAST_LINE);
        buttonPanel.add(shuffleBtn, BorderLayout.AFTER_LAST_LINE);
        buttonPanel.add(clearBtn, BorderLayout.AFTER_LAST_LINE);

        // Setting menu bar
        menu.add(newDeck);
        menu.add(exit);
        menuBar.add(menu);
        menuBar.setVisible(true);

        // Setting the deck frame
        deck.add(BorderLayout.NORTH, menuBar);
        deck.add(BorderLayout.SOUTH, buttonPanel);
        deck.add(BorderLayout.CENTER, jscrollPane);
        deck.pack();
    }

    /**
     * @param cards list of cards to be exhibited on the deck.
     */
    public void setDeck(ArrayList<Card> cards) {
        contentPanel.removeAll();
        for (Card c : cards) {
            JLabel label = new JLabel();
            label.setIcon(new ImageIcon(c.getImage()));
            label.setSize(10, 10);
            label.setBounds(10, 10, 10, 10);
            contentPanel.add(BorderLayout.PAGE_END, label);
        }
        jscrollPane.revalidate();
        jscrollPane.repaint();
    }

    /**
     * Wipes the deck contents.
     */
    public void clearDeck() {
        contentPanel.removeAll();
        contentPanel.repaint();
        drawBtn.setEnabled(true);
    }
}