/**
 * Name: Jon Reyrao
 * Date: 9/1/17
 * Period: 8
 * Program Name: Rock, Paper, Scissors
 * Program Description: This program lets the user play a game of rock, paper, scissors.
 * The user enters a number between 0 and 2 to choose an action, and the computer randomly 
 * generates a number between 0 and to 2 to choose an action. Based on the rules of rock,
 * paper, scissors, the program will print if the user drew, won, or lost against the computer's action.
 */

import java.util.Scanner;

public class RockPaperScissors
{
    public static void main(String [] args)
    { 
        //for indexing the array, and making the program more readable
        final int ROCK = 0;
        final int PAPER = 1;
        final int SCISSORS = 2;
        
        System.out.println("\nYou are playing Rock, Paper, Scissors against the computer.");
        System.out.println
        (
        "\nOptions:" +
        "\n0. Rock" +
        "\n1. Paper" +
        "\n2. Scissors"
        );
       
        //Input:playerChoice to decide which action they want to take
        System.out.print("\nChoice:");
        Scanner input = new Scanner(System.in);
        
        //in case of double input, choice will still be cast to an int
        double doubleChoice = input.nextDouble();
        int playerChoice = (int)doubleChoice;
        
        boolean noResult = false;
        if(playerChoice < 0 || playerChoice > 2)
        {
            System.out.println("\nNot a valid option.");
            //in the case of the player not putting in a correct choice
            //the program will do nothing (through the use of logic).
            noResult = true;
        }
        
        //For future random integer generation:
        // min+(int)(Math.random()*((max-min)+1))
        //min and max inclusive
        
        //min = 0, max = 2 in this case
        int computerChoice = (int)(Math.random()*3);
        
        String[] action = {"rock", "paper", "scissors"};
        
        if(noResult) 
        {
        }
        
        //Major Process: Game logic checking if the user won, lost, or drew based on the computer's 
        //actions
        //game rules: 
        //paper beats rock
        //scisors beat paper
        //rock beat scissors
        
        //Output: Statement of whether the user won, lost, or drew and what they chose
        //and what the computer chose.
       
        else if(playerChoice == computerChoice)
        {
            System.out.println
            (
            "\nDraw."+ 
            "\nYou and the computer both chose " + 
            action[computerChoice] + "."
            );
        }
        
        else 
        {
            boolean victory = true;
          
            //switch cases only have to deal with computerChoices that make the player lose
            //because player victory is assumed to be true otherwise.
            
            switch (playerChoice)
            {
                case ROCK:
                    if(computerChoice == PAPER)
                    {
                        victory = false;
                    }
                break;
            
                case PAPER:
                    if(computerChoice == SCISSORS)
                    {
                        victory = false;
                    }
                break;
                
                case SCISSORS:
                    if(computerChoice == ROCK)
                    {
                        victory = false;
                    }
                break;
            }
            
            if(victory)
            {
                System.out.println
                (
                "\nWin." + "\nYour " + action[playerChoice] + 
                " beats the computer's " + action[computerChoice] + "."
                );
            }
            
            else
            {
                System.out.println
                (
                "\nLoss." + "\nThe computer's " + action[computerChoice] +
                " beats your " + action[playerChoice] + "."
                );
            }
        
        }
     
    }
} 