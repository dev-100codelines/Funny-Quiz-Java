package FunnyQuiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Question {
    private ArrayList<Game> gameSet;

    public Question(){
        gameSet = new ArrayList<Game>();

        String q;
        q = "In space whichsad thing cannot perform properly?";
        String[] a = {"Cough" , "Cry" , "Hiccup" , "Sneeze"};
        gameSet.add(new Game(q,a,"Cry"));

        q = "How many months have 28 days?";
        a = new String[]{"2" , "1" , "All of them" , "Depends it there's a leap year or not"};
        gameSet.add(new Game(q,a,"All of them"));

        q = "Divide 30 by half and add 10";
        a = new String[]{"40.5" , "50" , "70" , "none"};
        gameSet.add(new Game(q,a,"70"));

        q = "Mathew's father has three sons- Joseph I and Joseph II. Can you guess the name of the third son? ";
        a = new String[]{"Joseph III" , "Jerin " , "Mathew" , "Joseph"};
        gameSet.add(new Game(q,a, "Mathew"));

        q= "Walt Disney was said to be afraid of which creature?";
        a= new String[]{ "Mice" , "Snakes" , "Lions" , "Dogs"};
        gameSet.add(new Game(q,a,"Mice"));

        q = "If a leaf falls to the ground in a forest and no one hears it, does it make a sound?";
        a = new String[]{"Yes","No","Depends on how heavy the leaf was","Depends on where it landed"};
        gameSet.add(new Game(q,a,"Yes"));

        q = "There are 45 apples in your basket. You take three apples out of the basket. How many apples are left?";
        a = new String[]{"3","42","45","I do not have apples"};
        gameSet.add(new Game(q,a,"45"));

        Collections.shuffle(gameSet , new Random());
    }
    public void start(){
        Scanner scanner = new Scanner(System.in);
        int numCorrect = 0;
        for (int question = 0 ; question < gameSet.size() ; question++){
            System.out.println(gameSet.get(question).getQuestion());
            int numChoices = gameSet.get(question).getChoices().size();

            for (int choice = 0 ; choice< numChoices ; choice++){
                System.out.println((choice+1) + ":" + gameSet.get(question).getChoices().get(choice));
            }
            int playerAnswer = scanner.nextInt();
            ArrayList<String>  choicesSet = gameSet.get(question).getChoices();

            String correctAnswer = gameSet.get(question).getAnswer();
            int correctAnswerIndex = choicesSet.indexOf(correctAnswer);

            if (playerAnswer == correctAnswerIndex + 1){
                numCorrect++;
            }
        }
        scanner.close();
        System.out.println("You Get " + numCorrect + " Write Answers");
    }
}
