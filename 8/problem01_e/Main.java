package practice_8th_week.problem01_e;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BoxController bc = new BoxController();
		bc.setModel(new BoxModel(), new BoxModel());
		bc.inputBox();
		bc.showVolume();
		bc.putInTest();
		sc.close();
	}
}
