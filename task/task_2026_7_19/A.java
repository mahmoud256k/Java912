import java.util.Scanner;

public class Main {

    public void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        Main obj = new Main();
        obj.printNumbers(n);
        
        scanner.close();
    }
}