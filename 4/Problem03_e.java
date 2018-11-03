import java.util.Scanner;

public class Problem03_e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            result += n * Math.pow(2, t - i);
        }
        System.out.println(result);
    }
}
