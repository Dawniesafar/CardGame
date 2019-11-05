import Modules.Card;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Manages the decks when having multi-deck game.
 */
public class DeckManager {

    private CardManager cardMngr;
    private GUI myGui;

    public DeckManager() {
        myGui = new GUI();
        cardMngr = new CardManager();
        myGui.menuBar.setVisible(false);
    }

    public void drawCard() {
        myGui.drawBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cardMngr.drawCard();
                myGui.setDeck((ArrayList) cardMngr.cardList);
                if (cardMngr.cardList.size() == 52) {
                    myGui.drawBtn.setEnabled(false);
                    cardMngr.deckIsFullMsg();
                }
            }
        });
    }

    public void shuffleCards() {
        myGui.shuffleBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cardMngr.shuffle(cardMngr.cardList);
                myGui.setDeck((ArrayList) cardMngr.cardList);
            }
        });
    }

    public void sortCards() {
        myGui.sortBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ArrayList<Card> sortedArray = (ArrayList) cardMngr.sort(cardMngr.cardList);
                myGui.setDeck(sortedArray);
            }
        });
    }

    public void clearDeck() {
        myGui.clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cardMngr.clearDeck();
                myGui.clearDeck();
            }
        });
    }
}
