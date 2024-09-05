package com.first.app;

import javax.swing.*;

public class App 
{
    public static void main( String[] args )
    {

        SwingUtilities.invokeLater(() -> {
            TaskUI ui = new TaskUI();
            ui.setVisible(true);
        });
    }
}
