import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1 = 0;

        Scanner sc = new Scanner(System.in);

        n1 = sc.nextInt();

        if(100>=n1&&n1>=90){
            System.out.println("A");
        } else if (n1>=80) {
            System.out.println("B");
        } else if (n1>=70) {
            System.out.println("C");
        } else if (n1>=60) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }

    }
}