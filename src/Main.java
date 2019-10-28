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
        Card card3 = cardMngr.drawCard();
        Card card4 = cardMngr.drawCard();
        Card card5 = cardMngr.drawCard();
        Card card6 = cardMngr.drawCard();
        Card card7 = cardMngr.drawCard();
        Card card8 = cardMngr.drawCard();
        Card card9 = cardMngr.drawCard();
        Card card10 = cardMngr.drawCard();
        Card card11 = cardMngr.drawCard();
        Card card12 = cardMngr.drawCard();
        Card card13 = cardMngr.drawCard();
        Card card14 = cardMngr.drawCard();
        Card card15 = cardMngr.drawCard();
        Card card16 = cardMngr.drawCard();
        Card card17 = cardMngr.drawCard();
        Card card18 = cardMngr.drawCard();
        Card card19 = cardMngr.drawCard();
        Card card20 = cardMngr.drawCard();
        Card card21 = cardMngr.drawCard();
        Card card22 = cardMngr.drawCard();
        Card card23 = cardMngr.drawCard();
        Card card24 = cardMngr.drawCard();
        Card card25 = cardMngr.drawCard();
        Card card26 = cardMngr.drawCard();
        Card card27 = cardMngr.drawCard();
        Card card28 = cardMngr.drawCard();
        Card card29 = cardMngr.drawCard();
        cardMngr.printAll(cardMngr.cardList);

//        System.out.println("***********");
//        cardMngr.shuffle(cardMngr.cardList);
//        cardMngr.printAll(cardMngr.cardList);

    }
}
