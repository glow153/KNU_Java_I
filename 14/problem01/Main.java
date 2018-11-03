package practice_14th_week.problem01;

public class Main {
	public static void main(String[] args) {
		Password pwd = new Password();
		while(pwd.isRunning()) {
			pwd.makePwd();
			pwd.checkPwd();
			pwd.confirmPwd();
		}
	}
}
