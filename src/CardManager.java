import Modules.Card;
import Modules.Suit;

import java.util.*;
import java.util.stream.Collectors;

public class CardManager {
    protected List<Card> cardList = new ArrayList<>();
    int value = 1;
    protected  List<Integer> values = new ArrayList<>();

    public CardManager() {
    }

    /**
     * Creates a full card list with all 52 cards.
     *
     * @return list of 52 objects of cards
     */
    public List<Card> createCards() {
        for (int suit = 0; suit < 4; suit++) {
            for (int name = 1; name < 14; name++) {
                cardList.add(new Card(name, getSuit(suit), value, null));
                value++;
            }
        }
        return cardList;
    }

    /**
     * Printing all cards in the list for purposes of quick test
     *
     * @param printedList list of cards on the deck
     */
    public void printAll(List<Card> printedList) {
        printedList.forEach(card -> System.out.println("Number: " + card.getName() +
                " ,Suit of: " + card.getSuit().toString() + " ,Value of: " + card.getValue()));
        //System.out.println(cardList.size())
    }

    /**
     * Sorts cards according to the value each card holds.
     *
     * @param cardList the cards to be sorted
     * @return the list of cards sorted
     */
    public List<Card> sort(List<Card> cardList) {
        List<Card> sortedCards = cardList.stream()
                .sorted(Comparator.comparing(Card::getValue))
                .collect(Collectors.toList());
        return sortedCards;
    }

    /**
     * Randomly shuffles the cards of the deck for the given
     * card list.
     *
     * @param cardList List of cards on the current deck
     * @return the list of the cards after shuffling.
     */
    public List<Card> shuffle(List<Card> cardList) {
        List<Card> shuffledCards = cardList;
        Random random = new Random();
        for (int i = 0; i < cardList.size(); i++) {
            int change = i + random.nextInt(cardList.size()-i);
            swap(cardList,i,change);
        }
        return shuffledCards;
    }

    private void swap(List<Card> list, int i, int change){
        Card helper = list.get(i);
        Card changedCard = list.get(change);
        list.set(i, changedCard);
        list.set(change, helper);
    }


    //TODO task2 make sure to disable the draw button when we have all
    //cards on the deck.
    /**
     * Draw a random card from the deck
     * @return an object of cardK
     */
    public Card drawCard() {
        getValuesFromList(cardList);
        Card randomCard = null;
        Random random = new Random();
        int randomSuit = random.nextInt(3);
        int randomName = random.nextInt(13) + 1;
        int value = getValue(randomName, randomSuit);
        if(values.contains(value)) {
            randomName = random.nextInt(13) + 1;
        }
        else {
            randomCard = new Card(randomName, getSuit(randomSuit), value, null);
            cardList.add(randomCard);
        }
        return randomCard;
    }

    /**
     * This method calculates the value for the given name and suit.
     *
     * @param name the card number, king, queen or prince
     * @param suit the card suit(Hearts, Diamonds, Clover or Spades.
     * @return card value
     */
    private int getValue(int name, int suit) {
        int value;
        switch (suit) {
            case 0:
                value = name;
                break;
            case 1:
                value = name + 13;
                break;
            case 2:
                value = name + 26;
                break;
            case 3:
                value = name + 39;
                break;
            default:
                value = 0;
                break;
        }
        return value;
    }

    /**
     * Returns the Suit for the given suitRef
     *
     * @param suitRef 0 is Hearts, 1 is Diamonds, 2 is Clover and 3 is spades.
     * @return the suit hearts, diamonds, clover or spades.
     */
    public Suit getSuit(int suitRef) {
        if (suitRef == 0)
            return Suit.hearts;
        else if (suitRef == 1)
            return Suit.diamonds;
        else if (suitRef == 2)
            return Suit.clover;
        else if (suitRef == 3)
            return Suit.spades;
        else return null;
    }

    private void getValuesFromList(List<Card> cardlist){
        for (Card c : cardlist)
        {
            values.add(c.getValue());
        }
    }
}
