import java.util.Scanner;

public class Main {

    public void printPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        Main obj = new Main();
        obj.printPyramid(n);
        
        scanner.close();
    }
}