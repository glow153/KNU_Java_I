import java.util.Scanner;

public class Problem03_e2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            if (n == 1)
                result |= (1 << t-i);
        }
        System.out.println(result);
    }
}
