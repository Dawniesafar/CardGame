import Modules.Card;
import Modules.Suit;

import java.util.ArrayList;
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

//        Card card1 = cardMngr.drawCard();
//        Card card2 = cardMngr.drawCard();
//        Card card3 = cardMngr.drawCard();
//        Card card4 = cardMngr.drawCard();
//        Card card5 = cardMngr.drawCard();
//        Card card6 = cardMngr.drawCard();
//        Card card7 = cardMngr.drawCard();
//        Card card8 = cardMngr.drawCard();
//        Card card9 = cardMngr.drawCard();
//        Card card10 = cardMngr.drawCard();
//        Card card11 = cardMngr.drawCard();
//        Card card12 = cardMngr.drawCard();
//        Card card13 = cardMngr.drawCard();
//        Card card14 = cardMngr.drawCard();
//        Card card15 = cardMngr.drawCard();
//        Card card16 = cardMngr.drawCard();
//        Card card17 = cardMngr.drawCard();
//        Card card18 = cardMngr.drawCard();
//        Card card19 = cardMngr.drawCard();
//        Card card20 = cardMngr.drawCard();
//        Card card21 = cardMngr.drawCard();
//        Card card22 = cardMngr.drawCard();
//        Card card23 = cardMngr.drawCard();
//        Card card24 = cardMngr.drawCard();
//        Card card25 = cardMngr.drawCard();
//        Card card26 = cardMngr.drawCard();
//        Card card27 = cardMngr.drawCard();
//        Card card28 = cardMngr.drawCard();
//        Card card29 = cardMngr.drawCard();
//        cardMngr.printAll(cardMngr.cardList);

        Card aceOfSpades = new Card(1, Suit.spades,40, cardMngr.saveCardImage(40));
        Card twoOfSpades = new Card(2, Suit.spades,41, cardMngr.saveCardImage(41));
        Card threeOfSpades = new Card(3, Suit.spades,42, cardMngr.saveCardImage(42));
        Card fourOfSpades = new Card(4, Suit.spades,43, cardMngr.saveCardImage(43));
        Card fiveOfSpades = new Card(5, Suit.spades,44, cardMngr.saveCardImage(44));
        Card sixOfSpades = new Card(6, Suit.spades,45, cardMngr.saveCardImage(45));
        ArrayList<Card> cardList = new ArrayList<>();
        cardList.add(aceOfSpades);
        cardList.add(twoOfSpades);
        cardList.add(threeOfSpades);
        cardList.add(fourOfSpades);
        cardList.add(fiveOfSpades);
        cardList.add(sixOfSpades);
        GUI myGui = new GUI();
        myGui.setDeck((ArrayList) cardList);
//        System.out.println("***********");
//        cardMngr.shuffle(cardMngr.cardList);
//        cardMngr.printAll(cardMngr.cardList);

    }
}
