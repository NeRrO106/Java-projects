package com.trivia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TriviaGame{
    private List<Question> questions;
    private int score;

    public TriviaGame(){
        questions = new ArrayList<>();
        questions.add(new Question("Care este capitala Germaniei?",new String[]{"Berlin", "Copenhaga", "Bucuresti", "Roma"}, 0));
        questions.add(new Question("Cine a scris Hamlet?", new String[]{"Hemingway", "Fitzgerald", "Dickens", "Shakespeare"}, 3)); 
        score = 0;
    }

   public void addQuestion(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu intrebarea: ");
        String question = scanner.nextLine();


        String[] options = new String[4];
        for(int i = 0; i < 4; i++){
            System.out.println("Introdu optiunea: " + (i+1) + ": ");
            options[i] = scanner.nextLine();
        }

        System.out.println("Introdu index-ul variantei corecte: (1-4)");
        int correctAnswer = scanner.nextInt() - 1;
        questions.add(new Question(question, options, correctAnswer));
        System.out.println("Intrebare adaugata cu succes");
    } 

    public void start(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Doresti sa adaugi o intrebare? (da/nu)");
        String addQuestionAnswer = scan.nextLine().trim().toLowerCase();

        while(addQuestionAnswer.equals("da")){
            addQuestion();
            System.out.println("Doresti sa adaugi o alta intrebare? (da/nu)");
            addQuestionAnswer = scan.nextLine().trim().toLowerCase();
        }

        for(Question quest : questions){
            System.out.println(quest.getQuestion());
            System.out.println("Raspunsul trebuie introdus sub forma de cifra(1, 2, 3 sau 4)");
            String[] options = quest.getOptions();

            for(int i = 0 ; i < options.length; i++){
                System.out.println((i+1) + ": " + options[i]);
            }

            System.out.println("Raspunsul tau: ");
            int answer = scan.nextInt() - 1;

            if(quest.isCorrect(answer)){
                score++;
                System.out.println("Raspuns corect\n");
            }
            else{
                System.out.println("Raspuns incorect\n");
            }
        }
        System.out.println("Scorul tau final este: " + score);
    }
}
