package com.first.app;

import java.util.Timer;
import java.util.TimerTask;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

public class NotificationManager{
    private Timer timer;

    public NotificationManager(){
        timer = new Timer();
    }
    
    public void setNotification(Task task){
        TimerTask taskReminder = new TimerTask(){
            @Override
            public void run(){
                System.out.println("Memento: Sarcina " + task.getTitle() + " va avea loc in curand!");
                JOptionPane.showMessageDialog(null, "Memento: Sarcine " + task.getTitle() + " va avea loc in curand!");
            }
        };
        timer.schedule(taskReminder, 5000);
    }
}
