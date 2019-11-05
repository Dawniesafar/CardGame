import Modules.Card;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        GUI mainGui = new GUI();
        CardManager mainCardMngr = new CardManager();

        mainGui.drawBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mainCardMngr.drawCard();
                mainGui.setDeck((ArrayList) mainCardMngr.cardList);
            }
        });

        mainGui.shuffleBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mainCardMngr.shuffle(mainCardMngr.cardList);
                mainGui.setDeck((ArrayList) mainCardMngr.cardList);
            }
        });

        mainGui.sortBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ArrayList<Card> sortedArray = (ArrayList) mainCardMngr.sort(mainCardMngr.cardList);
                mainGui.setDeck(sortedArray);
            }
        });

        mainGui.clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mainCardMngr.clearDeck();
                mainGui.clearDeck();
            }
        });

        mainGui.newDeck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                GUI.deckNr++;
                DeckManager deckManager = new DeckManager();
                deckManager.drawCard();
                deckManager.shuffleCards();
                deckManager.sortCards();
                deckManager.clearDeck();
            }
        });

        mainGui.exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }
}
