package com.first.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;

public class TaskUI extends JFrame{
    private TaskManager taskManager;
    private JTextArea taskDisplayArea;
    private JTextField titleField, descriereField;
    private JSpinner dueDateSpinner;

    public TaskUI(){
        taskManager = new TaskManager();
        setupUI();
    }

    private void setupUI(){
        setTitle("Task Manager");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        taskDisplayArea = new JTextArea();
        taskDisplayArea.setEditable(false);
        add(new JScrollPane(taskDisplayArea), BorderLayout.CENTER);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2));

        inputPanel.add(new JLabel("Title:"));
        titleField = new JTextField();
        inputPanel.add(titleField);

        inputPanel.add(new JLabel("Descriere:"));
        descriereField = new JTextField();
        inputPanel.add(descriereField);

        inputPanel.add(new JLabel("Data:"));
        dueDateSpinner = new JSpinner(new SpinnerDateModel());
        inputPanel.add(dueDateSpinner);

        add(inputPanel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 5));

        JButton addButton = new JButton("Add Task");
        addButton.addActionListener(new AddTaskAction());
        buttonPanel.add(addButton);

        JButton deleteButton = new JButton("Delete Task");
        deleteButton.addActionListener(new DeleteTaskAction());
        buttonPanel.add(deleteButton);

        JButton editButton = new JButton("Edit Task");
        editButton.addActionListener(new EditTaskAction());
        buttonPanel.add(editButton);

        JButton completeButton = new JButton("Complet Task");
        completeButton.addActionListener(new CompleteTaskAction());
        buttonPanel.add(completeButton);

        JButton showDueTasksButton = new JButton("Afiseaza Taskuri necompletate");
        showDueTasksButton.addActionListener(new ShowTaskAction());
        buttonPanel.add(showDueTasksButton);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    private class AddTaskAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String title = titleField.getText();
            String descriere = descriereField.getText();
            LocalDate dueDate = ((java.util.Date) dueDateSpinner.getValue()).toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
            
            Task newTask = new Task(title, descriere, dueDate);
            newTask.setIsComplet(false);
            taskManager.addTask(newTask);
            taskDisplayArea.append(newTask.toString() + "\n");

            titleField.setText("");
            descriereField.setText("");
            dueDateSpinner.setValue(new java.util.Date());
            
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException ex){
                ex.printStackTrace();
            }

        }
    }

    private class DeleteTaskAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String title = titleField.getText();
            Task deleteTask = null;
            for(Task task : taskManager.getTask()){
                if(task.getTitle().equals(title)){
                    deleteTask = task;
                    break;
                }
            }
            if(deleteTask != null){
                taskManager.deleteTask(deleteTask);
                refreshTaskDisplay();
            }
            else{
                JOptionPane.showMessageDialog(TaskUI.this, "Task-ul nu a fost gasit");
            }
        }
    }

    private class EditTaskAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String title = titleField.getText();
            Task editTask = null;
            for(Task task : taskManager.getTask()){
                if(task.getTitle().equals(title)){
                    editTask = task;
                    break;
                }
            }

            if(editTask != null){
                String newTitle = JOptionPane.showInputDialog("Titlu nou:", editTask.getTitle());
                String newDescriere = JOptionPane.showInputDialog("Descriere noua:", editTask.getDescriere());
                String newDueDate = JOptionPane.showInputDialog("Data scadenta (YYYY-MM-DD):", editTask.getDate().toString());
                
                taskManager.updateTask(editTask, newTitle, newDescriere, LocalDate.parse(newDueDate), false);
                refreshTaskDisplay();
            }
            else{
                JOptionPane.showMessageDialog(TaskUI.this, "Task-ul nu a fost gasit");
            }
        }
    }

    private class CompleteTaskAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String title = titleField.getText();
            Task completeTask = null;
            for(Task task : taskManager.getTask()){
                if(task.getTitle().equals(title)){
                    completeTask = task;
                    break;
                }
            }

            if(completeTask != null){
                completeTask.completedTask();
                refreshTaskDisplay();
            }
            else{
                JOptionPane.showMessageDialog(TaskUI.this, "Task-ul nu a fost gasit");
            }
        }
    }

    private class ShowTaskAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            ArrayList<Task> dueTasks = taskManager.getDueTasks();
            taskDisplayArea.setText("");
            for(Task task : dueTasks){
                taskDisplayArea.append(task.toString() + "\n");
            }
        }
    }

    private void refreshTaskDisplay(){
        taskDisplayArea.setText("");
        for(Task task : taskManager.getTask()){
            taskDisplayArea.append(task.toString() + "\n");
        }
    }
}
