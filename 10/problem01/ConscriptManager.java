package practice_10th_week.problem01;

public class ConscriptManager {
	String name = "ȫ�浿";
	int age = 20;
	boolean isMarried = false;
	
	
	public ConscriptManager() {
		
	}
	
	public ConscriptManager(String name) {
		this.name = name;
	}
	
	public ConscriptManager(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public ConscriptManager(String name, int age, boolean isMarried) {
		this.name = name;
		this.age = age;
		this.isMarried = isMarried;
	}
	
	public void printResult(){
		System.out.println("===¡���˻� ���ǥ===");
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		if (isMarried == true) {
			System.out.println("��ȥ���� : ��ȥ");
		}else{
			System.out.println("��ȥ���� : ��ȥ");
		}
		
		if (30>= age && age>= 20 && isMarried == false) {
			System.out.println("¡���˻� ��� �հ��Դϴ�.. ");
		}else{
			System.out.println("¡���˻� ��� ���հ��Դϴ�..");
		}
		
		System.out.println("=================\r\n");
	}
}
