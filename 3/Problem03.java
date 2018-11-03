import java.util.Scanner;

public class Problem03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 0, min = 0, max = 0;
		while(i<num){
			int height = sc.nextInt();
			if(min == max && min == 0)
				min = max = height;
			if(min > height)
				 min = height;
			if(max < height)
				max = height;
			i++;
		}
		System.out.println(max + " " + min);
	}
}