package com.mycompany.app;

import com.mycompany.app.Expense;
import java.util.ArrayList;

public class ExpenseManager{
    private ArrayList<Expense> expenses;

    public ExpenseManager(){
        expenses = new ArrayList<>();
    }

    public void addExpense(Expense expense){
        expenses.add(expense);
    }

    public void deleteExpense(Expense expense){
        expenses.remove(expense);
    }

    public ArrayList<Expense> getExpenses(){
        return new ArrayList<>(expenses);
    }

    public double getTotalExpenses(){
        double total = 0;
        for(Expense expense : expenses){
            total += expense.getAmount();
        }
        return total;
    }
}
