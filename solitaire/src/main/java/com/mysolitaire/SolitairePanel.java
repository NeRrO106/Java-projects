package com.mysolitaire;

import com.mysolitaire.Card;
import com.mysolitaire.Deck;

import javax.swing.*;
import java.awt.*;

public class SolitairePanel extends JPanel{
    private Deck deck;

    public SolitairePanel(){
        deck = new Deck();
        setPreferredSize(new Dimension(800, 600));
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        drawDeck(g);
    }

    private void drawDeck(Graphics g){
        Card card = deck.drawCard();
        if(card != null){
            card.Flip();
            g.drawString(card.toString(), 50, 50);
        }
    }
}
