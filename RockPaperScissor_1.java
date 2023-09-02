import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor_1 {
    
    private static final String ROCK = "R";
    private static final String PAPER = "P";
    private static final String SCISSOR = "S";

    public static void main(String[] args) {
        
        int comp;
        String computerMove="";
        int user;
        String userMove="";
        
        System.out.println("Enter your number:");
        Scanner sc = new Scanner(System.in);
        user = sc.nextInt();
        if (user == 1){
            userMove = ROCK;
        } else if (user == 2) {
            userMove = PAPER;
        } else if (user == 3) {
            userMove = SCISSOR;
        }
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
        System.out.println(computerMove);

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
