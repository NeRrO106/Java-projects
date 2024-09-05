package com.mysolitaire;

import java.util.ArrayList;
import java.util.Collections;

public class Deck{
    private ArrayList<Card> cards;

    public Deck(){
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        for(String suit : suits){
            for(String rank : ranks){
                cards.add(new Card(suit, rank));
            }
        }
        shuffle();
    }
    public void shuffle(){
        Collections.shuffle(cards);
    }
    public Card drawCard(){
        return cards.isEmpty() ? null : cards.remove(cards.size() - 1);
    }
}
