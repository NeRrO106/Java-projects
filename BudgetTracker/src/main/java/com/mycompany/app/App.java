package com.mycompany.app;

import javax.swing.SwingUtilities;
import com.mycompany.app.BudgetUI;

public class App 
{
    public static void main( String[] args )
    {
        SwingUtilities.invokeLater(() -> {
            BudgetUI ui = new BudgetUI();
            ui.setVisible(true);
        });
    }
}
