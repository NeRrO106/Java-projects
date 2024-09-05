package com.first.app;

import java.time.LocalDate;

public class Task{
    private String title;
    private String descriere;
    private LocalDate dueDate;
    private boolean isCompleted;

    public Task(String title, String descriere, LocalDate dueDate){
        this.title = title;
        this.descriere = descriere;
        this.dueDate = dueDate;
        this.isCompleted = false;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getDescriere(){
        return descriere;
    }
    public void setDescriere(String descriere){
        this.descriere = descriere;
    }

    public LocalDate getDate(){
        return dueDate;
    }
    public void setDate(LocalDate dueDate){
        this.dueDate = dueDate;
    }

    public boolean getIsCompleted(){
        return isCompleted;
    }
    public void setIsComplet(boolean isCompleted){
        this.isCompleted = isCompleted;
    }
    public void completedTask(){
        isCompleted = true;
    }

    @Override
    public String toString(){
        return title + ": "+ descriere + "-" + (isCompleted ? "Completat" : "In asteptare") + "(data: " + dueDate + ")";
    }
}

