import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        long a = input.nextLong();
        long b = input.nextLong();
        long c = input.nextLong();
        long d = input.nextLong();

        double result1 = b * Math.log(a);
        double result2 = d * Math.log(c);

        if (result1 > result2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        input.close();
    }
}