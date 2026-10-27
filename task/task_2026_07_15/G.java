import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextLong()) {
            long n = scanner.nextLong();
            long m = scanner.nextLong();
            long k = scanner.nextLong();
            
            KatryoshkaMaker maker = new KatryoshkaMaker();
            System.out.println(maker.getMaxKatryoshkas(n, m, k));
        }
        
        scanner.close();
    }
}

class KatryoshkaMaker {
    public long getMaxKatryoshkas(long eyes, long mouths, long bodies) {
        long type3 = Math.min(eyes, Math.min(mouths, bodies));
        
        eyes -= type3;
        bodies -= type3;
        
        long type1 = Math.min(eyes / 2, bodies);
        
        return type3 + type1;
    }
}