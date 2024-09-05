package com.mysolitaire;

import com.mysolitaire.Card;
import com.mysolitaire.Deck;

import java.util.ArrayList;
import java.util.List;

public class Game{
    private Deck deck;
    private List<List<Card>> tableau;
    private List<List<Card>> foundation;
    private List<Card> waste;

    public Game(){
        deck = new Deck();
        tableau = new ArrayList<>();
        foundation = new ArrayList<>();
        waste = new ArrayList<>();

        for(int i = 0; i < 4; i++_{
            foundation.add(new ArrayList<>());
        }

        for(int i = 0; i < 7; i++){
            List<Card> column = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                Card card deck.drawCard();
                if(j==i){
                    card.flip();
                }
                column.add(card);
            }
            tableau.add(column);
        }
    }
    public void start(){
    
    }

    public boolean moveCardFromTableauToFoundation(int tableauIndex, int foundationIndex) {
        List<Card> column = tableau.get(tableauIndex);
        if(column.isEmpty()){
            return false;
        }

        Card card = column.get(column.size() -1);
        List<Card> foundationPile = foundation.get(foundationIndx);

        if(canMoveToFoundation(card, foundationPile)){
            column.remove(column.size() - 1);
            foundationPile.add(card);
            if(!column.isEmpty()){
                column.get(column.size() - 1).flip();
            }
            return true;
        }
        return false;
    }
    
    public boolean canMoveWithinTableau(Card card, List<Card> column){
        if(column.isEmpty()){
            reutrn "King".equals(card.getRank());
        }
        else{
            Card topCard = column.get(column.size() - 1);
            return !card.getSuit().equals(topCard.getSuit()) && card.get
