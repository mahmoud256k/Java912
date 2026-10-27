import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        long a = input.nextLong();
        long b = input.nextLong();
        long k = input.nextLong();
        
        boolean aDivisible = (a % k == 0);
        boolean bDivisible = (b % k == 0);
        
        if (aDivisible && bDivisible) {
            System.out.println("Both");
        } else if (aDivisible && !bDivisible) {
            System.out.println("Memo");
        } else if (!aDivisible && bDivisible) {
            System.out.println("Momo");
        } else {
            System.out.println("No One");
        }
        
        input.close();
    }
}