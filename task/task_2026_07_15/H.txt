import java.util.Scanner;

public class Main {

    public void checkDataType(long n, long k, long a) {
        long product = n * k;
        
        if (product % a != 0) {
            System.out.println("double");
        } else {
            long result = product / a;
            if (result <= 2147483647L) {
                System.out.println("int");
            } else {
                System.out.println("long long");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        long a = scanner.nextLong();
        
        Main obj = new Main();
        obj.checkDataType(n, k, a);
        
        scanner.close();
    }
}