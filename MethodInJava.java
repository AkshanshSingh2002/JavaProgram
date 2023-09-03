import java.util.Scanner;

public class MethodInJava {

    static int logic(int x, int y) {
        int z;
        if (x>y) {
            z = (x + y) * 5;
        } 
        else {
            z = x + y;
        }
        return z;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Creating simpal methord

        System.out.println("Enter the Number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Number 2: ");
        int num2 = sc.nextInt();
        int num3;

        num3 = logic(num1, num2);   //Calling the logic method directly without creating an object because the methord is static 
                                    // The value of z is copied in num3
        System.out.println(num3);

    }
}