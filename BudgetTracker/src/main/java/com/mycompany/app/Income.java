package com.mycompany.app;

import java.time.LocalDate;

public class Income{
    private String source;
    private double amount;
    private LocalDate date;
    private IncomeCategory category;

    public Income(String source, double amount, LocalDate date, IncomeCategory category){
        this.source = source;
        this.amount = amount;
        this.date = date;
        this.category = category;
    }

    public String getSource(){
        return source;
    }
    public void setSource(String source){
        this.source = source;
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

    public IncomeCategory getIncomeType(){
        return category;
    }
    public void setIncomeType(IncomeCategory category){
        this.category = category;
    }

    @Override
    public String toString(){
        return "Income{" + "source:'" + source + "'" + ", amount:" + amount + ", date:" + date + ", category:" + category + "}";
    }
}
