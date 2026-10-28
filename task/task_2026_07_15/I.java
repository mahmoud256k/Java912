import java.util.Scanner;

public class Main {

    public boolean isLucky(int n) {
        int firstDigit = n / 10;
        int secondDigit = n % 10;
        
        if (secondDigit == 0 || firstDigit % secondDigit == 0 || secondDigit % firstDigit == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        Main obj = new Main();
        
        if (obj.isLucky(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}