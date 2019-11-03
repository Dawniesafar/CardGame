import Modules.Card;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GUI {

    public JFrame deck = new JFrame("Deck#1");
    public JPanel contentPanel = new JPanel();
    public JPanel buttonPanel = new JPanel();
    public JScrollPane jscrollPane = new JScrollPane();
    public JButton drawBtn = new JButton("Draw");
    public JButton sortBtn = new JButton("Sort");
    public JButton shuffleBtn = new JButton("Shuffle");

    public GUI() {
        deck.setVisible(true);
        deck.setSize(900, 700);
        deck.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPanel.setLayout(new GridLayout(4,10,0,0));
        jscrollPane = new JScrollPane(contentPanel);
        deck.add(jscrollPane);
        jscrollPane.setSize(300,300);
        jscrollPane.setVisible(true);

        drawBtn.setSize(10, 10);
        sortBtn.setSize(10, 10);
        shuffleBtn.setSize(10, 10);
        //adding buttons to the panel
        buttonPanel.add(drawBtn, BorderLayout.AFTER_LAST_LINE);
        buttonPanel.add(sortBtn, BorderLayout.AFTER_LAST_LINE);
        buttonPanel.add(shuffleBtn, BorderLayout.AFTER_LAST_LINE);
        deck.add(BorderLayout.SOUTH,buttonPanel);

    }

    public void setDeck(ArrayList<Card> cards){
        contentPanel.removeAll();
        for (Card c : cards) {
            JLabel label = new JLabel();
            label.setIcon(new ImageIcon(c.getImage()));
            label.setSize(10,10);
            label.setBounds(10,10,10,10);
            contentPanel.add(BorderLayout.CENTER, label);
            jscrollPane.revalidate();
            jscrollPane.repaint();
        }
    }
}