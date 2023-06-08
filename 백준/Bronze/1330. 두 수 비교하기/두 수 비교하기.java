import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 0;

        Scanner sc = new Scanner(System.in);

        n1 = sc.nextInt();
        n2 = sc.nextInt();

        if(n1>n2){
            System.out.println(">");
        } else if (n1<n2) {
            System.out.println("<");
        }else{
            System.out.println("==");
        }
        
    }
}