package com.mycompany.app;

import javax.swing.*;
import com.mycompany.app.IncomeManager;
import com.mycompany.app.ExpenseManager;
import com.mycompany.app.Income;
import com.mycompany.app.Expense;
import com.mycompany.app.IncomeCategory;
import com.mycompany.app.ExpenseCategory;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class BudgetUI extends JFrame{
    private IncomeManager incomeManager;
    private ExpenseManager expenseManager;
    private JTextArea incomeDisplayArea, expenseDisplayArea;
    private JTextField incomeSourceField, incomeAmountField, expenseDescriptionField, expenseAmountField;
    private JSpinner incomeDateSpinner, expenseDateSpinner;
    private JComboBox<IncomeCategory> incomeCategoryComboBox;
    private JComboBox<ExpenseCategory> expenseCategoryComboBox;
    private JLabel totalIncomeLabel, totalExpensesLabel, balanceLabel;
    
    public BudgetUI(){
       incomeManager = new IncomeManager();
       expenseManager = new ExpenseManager();
       setupUI();
    }

    private void setupUI(){
        setTitle("Budget Manager");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));

        JPanel incomePanel = new JPanel();
        incomePanel.setLayout(new BorderLayout());

        incomeDisplayArea = new JTextArea();
        incomeDisplayArea.setEditable(false);
        incomePanel.add(new JScrollPane(incomeDisplayArea), BorderLayout.CENTER);

        JPanel incomeInputPanel = new JPanel();
        incomeInputPanel.setLayout(new GridLayout(5,2));

        incomeInputPanel.add(new JLabel("Sursa:"));
        incomeSourceField = new JTextField();
        incomeInputPanel.add(incomeSourceField);

        incomeInputPanel.add(new JLabel("Suma:"));
        incomeAmountField = new JTextField();
        incomeInputPanel.add(incomeAmountField);

        incomeInputPanel.add(new JLabel("Date:"));
        incomeDateSpinner = new JSpinner(new SpinnerDateModel());
        incomeInputPanel.add(incomeDateSpinner);

        incomeInputPanel.add(new JLabel("Categorie:"));
        incomeCategoryComboBox = new JComboBox<>(IncomeCategory.values());
        incomeInputPanel.add(incomeCategoryComboBox);

        JButton addIncomeButton = new JButton("Adauga sursa de venit");
        addIncomeButton.addActionListener(new AddIncomeAction());
        incomeInputPanel.add(addIncomeButton);

        JButton viewIncomeButton = new JButton("Vezi venitul total.");
        viewIncomeButton.addActionListener(new ViewTotalIncome());
        incomeInputPanel.add(viewIncomeButton);

        incomePanel.add(incomeInputPanel, BorderLayout.NORTH);

        totalIncomeLabel = new JLabel("Venit total: 0.00 lei");
        incomePanel.add(totalIncomeLabel, BorderLayout.EAST);

        JPanel expensePanel = new JPanel();
        expensePanel.setLayout(new BorderLayout());

        expenseDisplayArea = new JTextArea();
        expenseDisplayArea.setEditable(false);
        expensePanel.add(new JScrollPane(expenseDisplayArea), BorderLayout.CENTER);

        JPanel expenseInputPanel = new JPanel();
        expenseInputPanel.setLayout(new GridLayout(5, 2));

        expenseInputPanel.add(new JLabel("Descriere:"));
        expenseDescriptionField = new JTextField();
        expenseInputPanel.add(expenseDescriptionField);

        expenseInputPanel.add(new JLabel("Suma:"));
        expenseAmountField = new JTextField();
        expenseInputPanel.add(expenseAmountField);

        expenseInputPanel.add(new JLabel("Date:"));
        expenseDateSpinner = new JSpinner(new SpinnerDateModel());
        expenseInputPanel.add(expenseDateSpinner);

        expenseInputPanel.add(new JLabel("Categorie:"));
        expenseCategoryComboBox = new JComboBox<>(ExpenseCategory.values());
        expenseInputPanel.add(expenseCategoryComboBox);

        JButton addExpenseButton = new JButton("Adauga o cheltuiala");
        addExpenseButton.addActionListener(new AddExpenseAction());
        expenseInputPanel.add(addExpenseButton);

        JButton viewExpensesButton = new JButton("Vezi totalul cheltuielilor");
        viewExpensesButton.addActionListener(new ViewTotalExpenses());
        expenseInputPanel.add(viewExpensesButton);

        expensePanel.add(expenseInputPanel, BorderLayout.NORTH);

        totalExpensesLabel = new JLabel("Totalul cheltuielilor: 0.00 lei");
        expensePanel.add(totalExpensesLabel, BorderLayout.EAST);

        JPanel balancePanel = new JPanel();
        balancePanel.setLayout(new BorderLayout());
        
        JButton showBalanceButton = new JButton("Vezi sold-ul ramas");
        showBalanceButton.addActionListener(new ViewTotalBalance());
        balancePanel.add(showBalanceButton, BorderLayout.WEST);

        balanceLabel = new JLabel("Sold: 0.00 lei");
        balancePanel.add(balanceLabel, BorderLayout.CENTER);

        add(incomePanel);
        add(expensePanel);
        add(balancePanel);
    }
    private class AddIncomeAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String source = incomeSourceField.getText();
            double amount = Double.parseDouble(incomeAmountField.getText());
            LocalDate date = ((java.util.Date) incomeDateSpinner.getValue()).toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
            IncomeCategory category = (IncomeCategory) incomeCategoryComboBox.getSelectedItem();

            Income newIncome = new Income(source, amount, date, category);
            incomeManager.addIncome(newIncome);
            incomeDisplayArea.append(newIncome.toString() + "\n");

            incomeSourceField.setText("");
            incomeAmountField.setText("");
            incomeDateSpinner.setValue(new java.util.Date());
            incomeCategoryComboBox.setSelectedIndex(0);
        }
    }
    private class ViewTotalIncome implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            double total = incomeManager.getTotalIncome();
            totalIncomeLabel.setText(String.format("Venit total: %.2f lei", total));
        }
    }
    private class AddExpenseAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String source = expenseDescriptionField.getText();
            double amount = Double.parseDouble(expenseAmountField.getText());
            LocalDate date = ((java.util.Date) expenseDateSpinner.getValue()).toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
            ExpenseCategory category = (ExpenseCategory) expenseCategoryComboBox.getSelectedItem();

            Expense newExpense = new Expense(source, amount, date, category);
            expenseManager.addExpense(newExpense);
            expenseDisplayArea.append(newExpense.toString() + "\n");

            expenseDescriptionField.setText("");
            expenseAmountField.setText("");
            expenseDateSpinner.setValue(new java.util.Date());
            expenseCategoryComboBox.setSelectedIndex(0);
        }
    }
    private class ViewTotalExpenses implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            double total = expenseManager.getTotalExpenses();
            totalExpensesLabel.setText(String.format("Totalul cheltuielilor: %.2f lei", total));
        }
    }
    private class ViewTotalBalance implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            double total = incomeManager.getTotalIncome() - expenseManager.getTotalExpenses();
            balanceLabel.setText(String.format("Sold total: %.2f lei", total));
        }
    }
}       
