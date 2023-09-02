import java.util.Scanner;

public class WhileA {
    
    public static void main(String[] args) {
        
        System.out.println("Enter the value:");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();
        
        int i = 1, j = 1;
        while (i <= k) {
            while (j<=i) {
                System.out.print("*"+" ");
                j++;
            }
            System.out.print("\n");
            i++;
            j = 1;
        }
        
    }
}
