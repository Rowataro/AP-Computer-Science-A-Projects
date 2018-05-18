
/**
 * Write a description of class Game here.
 * * Name: Jon Reyrao and Moulin Patel
 * * We got up to phase 3. We finished, but we didn't extensively test the computer playing using the strategy.
 * Date: 11/13/17
 * Periiod: 8
 * Program Name: Game
 * Program Description: Plays Nim
 * Rules of Nim
 */
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;

public class Game
{
   private boolean victory = false;
   
   public void setVictory(boolean state)
   {
       victory  = state;
   }
   
   public boolean hasBeenWon()
   {
       return victory;
   }
   
   private static void setPlayers(String[] playerNames, int totalPlayers)
   {
       Scanner input = new Scanner (System.in);
       
       for(int index = 0; index < totalPlayers; ++index)
       {
           String answer = JOptionPane.showInputDialog("Enter player " + (index+1) + "'s name: ");
           playerNames[index] = answer;
           System.out.println();
       }
   }
   
   public void play(Pile pile, Player[] players, boolean difficulty)
   {
       //true = Player 1's turn
       //false = Player 2's turn
       //randomly determines who goes first
       Random random = new Random();
       boolean turn = random.nextBoolean();
       System.out.print("Each player must take between one and half of the marbles present.");
       
       boolean computerPlays = false; 
       if(players[1].getName().equals("Computer"))
       {
           computerPlays = true;
       }
       
       while(!hasBeenWon())
       {
           System.out.println("\nThere are " + pile.getMarbles() + " remaining.");
           if(turn)
           {
               System.out.println('\n' + players[0].getName() + "'s turn");
               pile.subtract(playerInput(pile));
           }
           
           else if(computerPlays)
           {
               
               int amount = 0;
               if (!difficulty)
               {
                   amount = players[1].computerPlaysE(pile);
               }
               
               else
               {
                   amount = players[1].computerPlaysH(pile);
               }
               System.out.println("\nThe computer took " + amount + " marbles");
               pile.subtract(amount);
           }
               
           else 
           {
               System.out.println('\n' + players[1].getName() + "'s turn");
               pile.subtract(playerInput(pile));              
           }
           
          
           if(pile.getMarbles() == 1)
           {
               setVictory(true);
               if(turn)
               {
                   System.out.print(players[0].getName());
               }
               else
               {
                   System.out.print(players[1].getName());
               }
               
               System.out.println( " has won.");
           }
           //switches turns
           turn = !turn;
       }
   }
   public int playerInput(Pile pile)
   {
       Scanner input = new Scanner(System.in);
       int total = 0;
       
       do
       {
         String answer = JOptionPane.showInputDialog("Enter a number of marbles to take: ");
         total = Integer.parseInt(answer);
         
         if (total < 1 || total > (pile.getMarbles())/2)
         {
             System.out.println("Invalid.");
         } 
       } while (total < 1 || total > (pile.getMarbles() / 2));
     
       return total;
    }
    
    
 
    public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
       boolean difficulty = false;
       
       Game game = new Game();
       
       final int totalPlayers = 2;
       
       Player[] players = new Player[totalPlayers];
      
       while(true)
       {
           Pile pile = new Pile();
           String answer = JOptionPane.showInputDialog("Do you want to play against a computer? Yes: 1 No: Anything else");
           int choice = Integer.parseInt(answer);
           String[] playerNames = new String[totalPlayers];
           
           if(choice == 1)
           {
              String input2 = JOptionPane.showInputDialog("Do you want to on easy or hard difficulty? Easy: 0 Hard: Any other integer");
              int level = Integer.parseInt(input2);
              
              if (level != 0)
              {
                  difficulty = true;
                  
              }
  
              setPlayers(playerNames, 1);
              players[0] = new Player(playerNames[0]);
              players[1] = new Player("Computer");
           }
           
           else
           {
               setPlayers(playerNames, totalPlayers);
        
               for(int index = 0; index < totalPlayers; ++index)
               {
                  players[index] = new Player(playerNames[index]);
               }
           }
           
           game.play(pile, players, difficulty);
         
           String answer2 = JOptionPane.showInputDialog("Do you want to quit? Enter -1 to quit, or anything else to keep playing.");
           int choice2 = Integer.parseInt(answer2);
           if(choice2 == -1)
           {
               break;
           }
       }
       
   }
  
}
