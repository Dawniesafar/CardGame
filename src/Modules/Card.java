package Modules;

public class Card {

    private int name;
    private Suit suit;
    private int value;
    private String image;

    //constructor
    public Card(int name, Suit suit, int value, String image){
        this.name = name;
        this.suit = suit;
        this.value = value;
        this.image = image;
    }

    //getters
    public int getName(){ return name; }
    public Suit getSuit(){ return suit; }
    public int getValue(){ return value; }
    public String getImage(){ return image; }

    //setters
    private void setName(int name){ this.name = name; }
    private void setSuit(Suit suit){ this.suit = suit; }
    private void setValue(int value){ this.value = value; }
    private void setimage(String image){ this.image = image; }
}
