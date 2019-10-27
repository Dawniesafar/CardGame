import Modules.Card;

import java.util.List;

public class Main {
    public static void main(String args[]) {
        CardManager cardMngr = new CardManager();
//        List<Card> newDeck = cardMngr.createCards();
//        List<Card> sortedDeck = cardMngr.sort(newDeck);
//       cardMngr.printAll(sortedDeck);

//       Card random = cardMngr.drawCard();
//       System.out.println("Name: " + random.getName() + " Suit: " + random.getSuit().toString()
//               + " Value: " + random.getValue());

//        List<Card> shuffledCards = cardMngr.shuffle(newDeck);
//        cardMngr.printAll(shuffledCards);
//        System.out.println(shuffledCards.size());

        Card card1 = cardMngr.drawCard();
        Card card2 = cardMngr.drawCard();
        cardMngr.printAll(cardMngr.cardList);

    }
}
