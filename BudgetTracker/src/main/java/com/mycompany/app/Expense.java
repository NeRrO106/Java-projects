package com.mycompany.app;

import java.time.LocalDate;

public class Expense{
    private String description;
    private double amount;
    private LocalDate date;
    private ExpenseCategory category;

    public Expense(String description, double amount, LocalDate date, ExpenseCategory category){
        this.description = description;
        this.amount = amount;
        this.date = date;
        this.category = category;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public double getAmount(){
        return amount;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }

    public LocalDate getDate(){
        return date;
    }
    public void setDate(LocalDate date){
        this.date = date;
    }

    public ExpenseCategory getCategory(){
        return category;
    }
    public void setExpense(ExpenseCategory category){
        this.category = category;
    }

    @Override
    public String toString(){
        return "Expense{" + "description:'" + description + "'" + ", amount:" + amount + ", date:" + date + ", category:" + category + "}";
    }
}
