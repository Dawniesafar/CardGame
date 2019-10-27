package Modules;

import java.awt.image.BufferedImage;

public class Card {

    private int name;
    private Suit suit;
    private int value;
    private BufferedImage image;

    //constructor
    public Card(int name, Suit suit, int value, BufferedImage image){
        this.name = name;
        this.suit = suit;
        this.value = value;
        this.image = image;
    }

    //getters
    public int getName(){ return name; }
    public Suit getSuit(){ return suit; }
    public int getValue(){ return value; }
    public BufferedImage getImage(){ return image; }

    //setters
    private void setName(int name){ this.name = name; }
    private void setSuit(Suit suit){ this.suit = suit; }
    private void setValue(int value){ this.value = value; }
    private void setimage(BufferedImage image){ this.image = image; }
}
