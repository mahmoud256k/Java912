import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextLong()) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            
            BitwiseAdder adder = new BitwiseAdder();
            System.out.println(adder.add(a, b));
        }
        
        scanner.close();
    }
}

class BitwiseAdder {
    public long add(long a, long b) {
        return a ^ b;
    }
}