package com.mysolitaire;

public class Card{
    private String suit;
    private String rank;
    private boolean faceUp;

    public Card(String suit, String rank){
        this.suit = suit;
        this.rank = rank;
        this.faceUp = false;
    }
    public String getSuit(){
        return suit;
    }
    public String getRank(){
        return rank;
    }
    public boolean getFaceUp(){
        return faceUp;
    }
    public void Flip(){
        faceUp = !faceUp;
    }
    
    @Override
    public String toString(){
        return faceUp ? rank + " of " + suit : "Face Down";
    }
}
