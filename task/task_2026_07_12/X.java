import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        long l1 = input.nextLong();
        long r1 = input.nextLong();
        long l2 = input.nextLong();
        long r2 = input.nextLong();

        long start = Math.max(l1, l2);
        long end = Math.min(r1, r2);

        if (start <= end) {
            System.out.println(start + " " + end);
        } else {
            System.out.println(-1);
        }

        input.close();
    }
}