import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double x = input.nextDouble();
        double p = input.nextDouble();
        
        double originalPrice = (p * 100.0) / (100.0 - x);
        
        System.out.printf("%.2f\n", originalPrice + 1e-9);
        
        input.close();
    }
}