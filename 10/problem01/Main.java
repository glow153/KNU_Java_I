package practice_10th_week.problem01;

public class Main {
	public static void main(String[] args) {
		ConscriptManager person1 = new ConscriptManager();
		ConscriptManager person2 = new ConscriptManager("���缮");
		ConscriptManager person3 = new ConscriptManager("�ڸ��", 46);
		ConscriptManager person4 = new ConscriptManager("������", 22, true);
		
		person1.printResult();
		person2.printResult();
		person3.printResult();
		person4.printResult();
	}
}


