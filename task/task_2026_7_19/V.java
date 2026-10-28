import java.util.Scanner;

public class Main {

    public void printPum(int n) {
        int current = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(current + " ");
                current++;
            }
            System.out.println("PUM");
            current++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        Main obj = new Main();
        obj.printPum(n);
        
        scanner.close();
    }
}