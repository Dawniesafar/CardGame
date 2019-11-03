import Modules.Card;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        CardManager cardMngr = new CardManager();
        GUI myGui = new GUI();

        myGui.drawBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cardMngr.drawCard();
                myGui.setDeck((ArrayList)cardMngr.cardList);
            }
        });

        myGui.shuffleBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cardMngr.shuffle(cardMngr.cardList);
                myGui.setDeck((ArrayList) cardMngr.cardList);
            }
        });

        myGui.sortBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ArrayList<Card> sortedArray = (ArrayList) cardMngr.sort(cardMngr.cardList);
                myGui.setDeck(sortedArray);
            }
        });
    }
}
