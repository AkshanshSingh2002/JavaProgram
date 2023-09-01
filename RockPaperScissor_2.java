import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor_2 {
     
    private static final String ROCK = "R";
    private static final String PAPER = "P";
    private static final String SCISSOR = "S";

    public static void main(String[] args) {

        int comp;
        String computerMove="";
        String user;
        String userMove="";
        int noOfRounds;
        Scanner sc = new Scanner(System.in);

        System.out.println("How many times do you want ot play the game: ");
        noOfRounds = sc.nextInt();

        System.out.println("Enter R, P, S for Rock, Paper, Scissor respectively \n");
        
        for (int i = 0; i < noOfRounds; i++) {
            
            System.out.print("Enter your choise: ");
           
            user  = sc.next().toUpperCase();
            userMove = user;

            sc.close();

            Random random = new Random();
            comp = random.nextInt(3)+1;
            if (comp == 1) {
              computerMove = ROCK;
            } else if (comp == 2) {
              computerMove = PAPER;
            } else if (comp == 3) {
              computerMove = SCISSOR;
            }   
            System.out.println("Computer move: " + computerMove + "\n");

            if (userMove.equals(computerMove)) {
                System.out.println("IT's a tie");
            
            } else if (userMove.equals(ROCK)) {
                if (computerMove.equals(PAPER)) {
                    System.out.println("\"You lose!! Paper eats rock.\"");
                } else if (computerMove.equals(SCISSOR)){
                    System.out.println("\"You win!! Rock crush Scissor.\"");                
                }
            }else if (userMove.equals(PAPER)) {
                if (computerMove.equals(ROCK)){
                    System.out.println("\"You win!! Paper cover's Rock.\"");
                } else if (computerMove.equals(SCISSOR)) {
                    System.out.println("\"You lose!! Scissor cute's Paper.\"");
                }
            } else if (userMove.equals(SCISSOR)) {
                if (computerMove.equals(ROCK)) {
                    System.out.println("\"You lose!! Rock crush Scissor\"");
                } else if (computerMove.equals(PAPER)) {
                    System.out.println("You win!! Scissor cuts Paper.");
                }
            } else {
                System.out.println("Invalid Input");
            }
        }    
        
   
   
    }
         
}
