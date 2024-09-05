package com.first.app;

import java.util.ArrayList;
import java.time.LocalDate;

public class TaskManager{
    private ArrayList<Task> tasks;
    private NotificationManager notificationManager;

    public TaskManager(){
        tasks = new ArrayList<>();
        notificationManager = new NotificationManager();
    }

    public void addTask(Task task){
        tasks.add(task);
        notificationManager.setNotification(task);
    }

    public void deleteTask(Task task){
        tasks.remove(task);
    }

    public ArrayList<Task> getTask(){
        return new ArrayList<Task>(tasks);
    }

    public void updateTask(Task oldTask, String title, String descriere, LocalDate dueDate, boolean isCompleted){
        if(tasks.contains(oldTask)){
            int index = tasks.indexOf(oldTask);
            Task updateTask = tasks.get(index);
            updateTask.setTitle(title);
            updateTask.setDescriere(descriere);
            updateTask.setDate(dueDate);
            updateTask.setIsComplet(isCompleted);
        }
    }
    public ArrayList<Task> getDueTasks(){
        ArrayList<Task> dueTasks = new ArrayList<>();
        for(Task task : tasks){
            if(!task.getIsCompleted() && task.getDate().equals(LocalDate.now())){
                dueTasks.add(task);
            }
        }
        return dueTasks;
    }
}
