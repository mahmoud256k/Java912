import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if (Math.abs(a - b) <= 1 && (a + b) > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}