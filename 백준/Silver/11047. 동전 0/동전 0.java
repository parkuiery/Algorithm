import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int r = 0;

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        Collections.reverse(list);

        for (int i = 0; i < n; i++) {
            r += k / list.get(i);
            k = k % list.get(i);
        }

        System.out.println(r);
    }
}