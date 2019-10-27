import Modules.Card;
import Modules.Suit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class CardManager {
    protected List<Card> cardList = new ArrayList<>();
    int value = 1;

    public CardManager(){
    }

    public List<Card> createCards(){
        for(int suit = 0; suit < 4; suit++){
            for(int name = 1; name < 14; name++){
                cardList.add(new Card(name,getSuit(suit),value,null));
                value++;
            }
        }
        return cardList;
    }

    public Suit getSuit(int suitRef){
        if(suitRef == 0)
            return Suit.hearts;
        else if (suitRef == 1)
                return Suit.diamonds;
        else if(suitRef == 2)
            return Suit.clover;
        else if(suitRef == 3)
            return Suit.spades;
        else return null;
    }

    public void printAll(List<Card> printedList) {
         printedList.forEach(card -> System.out.println("Number: " + card.getName() +
                    " Suit of: " + card.getSuit().toString() + " Value of: " + card.getValue()));
            //System.out.println(cardList.size())
            }

    public List<Card> sort(List<Card> cardList) {
        List<Card> sortedCards = cardList.stream()
                .sorted(Comparator.comparing(Card::getValue))
                .collect(Collectors.toList());
        return sortedCards;
    }

    public List<Card> shuffle(List<Card> shuffledCards) {
         shuffledCards = new ArrayList<>();
        for(int i = 0; i < 52; i++){
            shuffledCards.add(drawCard());
        }
        return shuffledCards;
    }

    public Card drawCard(){
        Random random = new Random();
        int randomName = random.nextInt(13);
        int randomSuit = random.nextInt(3);
        int Value = 0;

        Card randomCard = new Card(randomName, getSuit(randomSuit), getValue(randomName, randomSuit) ,null);
     return randomCard;
    }

    private int getValue(int name, int suit){
        int value;
        switch(suit) {
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
}
