import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a=1;
        int b=1;

        Scanner scanner = new Scanner(System.in);

//        while(a!=0&&b!=0){
//            a = scanner.nextInt();
//            b = scanner.nextInt();
//
//            System.out.println(a+b);
//        }

        for(int i=0;;i++){
            a = scanner.nextInt();
            b = scanner.nextInt();

            if(a==0&&b==0){
                return;
            }

            System.out.println(a+b);
            
        }
    }
}