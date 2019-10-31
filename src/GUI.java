import Modules.Card;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class GUI {

    JFrame deck = new JFrame("Deck#1");
    JPanel contentPanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JLabel cardLable = new JLabel(new ImageIcon());
    JButton drawBtn = new JButton("Draw");
    JButton sortBtn = new JButton("Sort");
    JButton shuffleBtn = new JButton("Shuffle");

    public GUI() {
        deck.setVisible(true);
        deck.setSize(900, 900);
        deck.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        contentPanel.setLayout(new GridLayout(10,4,1,1));
        JScrollPane jscrollPane = new JScrollPane(contentPanel);
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
        for (Card c : cards) {
            JLabel label = new JLabel();
            label.setIcon(new ImageIcon(c.getImage()));
            label.setSize(10,10);
            label.setBounds(10,10,10,10);
            contentPanel.add(BorderLayout.CENTER ,label);
        }
    }
}