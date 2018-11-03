import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        if(hour < 2)
            hour = 23;
        else
            hour =  hour - ((hour % 3) + 1);

        minute = 10;

        System.out.println(hour + " " + minute);
    }
}
