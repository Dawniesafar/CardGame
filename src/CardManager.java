import Modules.Card;
import Modules.Suit;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * This class is responsible for the functionality of the mini game.
 * All functions or draw a card, shuffle/sort cards are managed
 * in this class.
 */
public class CardManager {
    protected List<Card> cardList = new ArrayList<>();
    protected List<Integer> values = new ArrayList<>();
    int value = 1;

    public CardManager() {
    }

    /**
     * Creates a full card list with all 52 cards.
     *
     * @return list of 52 objects of cards
     */
    public List<Card> fullDeck() {
        for (int suit = 0; suit < 4; suit++) {
            for (int name = 1; name < 14; name++) {
                cardList.add(new Card(name, getSuit(suit), value, saveCardImage(value)));
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
        this.cardList = sortedCards;
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
            int change = i + random.nextInt(cardList.size() - i);
            swap(cardList, i, change);
        }
        return shuffledCards;
    }

    private void swap(List<Card> list, int i, int change) {
        Card helper = list.get(i);
        Card changedCard = list.get(change);
        list.set(i, changedCard);
        list.set(change, helper);
    }

    /**
     * Draw a random card
     *
     * @return an object of a card
     */
    public void drawCard() {
        Card randomCard = null;
        Random random = new Random();
        int randomSuit = random.nextInt(4);
        int randomName = random.nextInt(13) + 1;
        int value = getValue(randomName, randomSuit);

        if (cardList.size() > 0 && cardList.size() < 52) {
            do {
                randomName = random.nextInt(13) + 1;
                randomSuit = random.nextInt(4);
                value = getValue(randomName, randomSuit);
            } while (values.contains(value));
        }
        randomCard = new Card(randomName, getSuit(randomSuit), value, saveCardImage(value));
        cardList.add(randomCard);
        values.add(value);
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

    /**
     * Adds values of cards existed on the deck to a list
     * so we can check the newly drawn card is not on the deck.
     *
     * @param cardlist existed cards on the deck
     */
    private void getValuesFromList(List<Card> cardlist) {
        for (Card c : cardlist) {
            values.add(c.getValue());
        }
    }

    public String saveCardImage(int value) {
        String imagePath = System.getProperty("user.dir") + "\\src\\Resources\\" + value + ".jpg";
        return imagePath;
    }

    public void clearDeck() {
        cardList.clear();
        values.clear();
    }

    /**
     * Pop-up message when the deck is full with 52 cards.
     */
    public void deckIsFullMsg() {
        if (cardList.size() == 52) {
            JOptionPane.showMessageDialog(null,
                    "All cards are drawn. Please clear the deck!",
                    "Info Message",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
}
