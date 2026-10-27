import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String s = input.next();
        
        int opIndex = -1;
        char op = ' ';
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                opIndex = i;
                op = c;
                break;
            }
        }

        int a = Integer.parseInt(s.substring(0, opIndex));
        int b = Integer.parseInt(s.substring(opIndex + 1));

        int result = 0;

        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
        }

        System.out.println(result);

        input.close();
    }
}