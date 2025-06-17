import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int num = sc.nextInt();
        int result = 0;

        for(int i = 0; i<num; i++) {
            int n = sc.nextInt();
            if(n == 0) {
                stack.pop();
            } else  {
                stack.add(n);
            }
        }

        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        System.out.println(result);
    }
}
