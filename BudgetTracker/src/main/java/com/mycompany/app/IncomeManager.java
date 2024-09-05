package com.mycompany.app;

import com.mycompany.app.Income;
import java.util.ArrayList;

public class IncomeManager{
    private ArrayList<Income> incomes;

    public IncomeManager(){
        incomes = new ArrayList<>();
    }

    public void addIncome(Income income){
        incomes.add(income);
    }

    public void deleteIncome(Income income){
        incomes.remove(income);
    }

    public ArrayList<Income> getIncomes(){
        return new ArrayList<>(incomes);
    }

    public double getTotalIncome(){
        double total = 0;
        for(Income income : incomes){
            total += income.getAmount();
        }
        return total;
    }
}
