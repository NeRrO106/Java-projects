package com.mysolitaire;

import com.mysolitaire.SolitairePanel;

import javax.swing.*;

public class App 
{
    public static void main( String[] args )
    {
        SwingUtilities.invokeLater(() ->{
            JFrame frame = new JFrame("Solitaire");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.add(new SolitairePanel());
            frame.setVisible(true);
        });
    }
}
