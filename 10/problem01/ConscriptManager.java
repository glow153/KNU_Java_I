package practice_10th_week.problem01;

public class ConscriptManager {
	String name = "홍길동";
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
		System.out.println("===징집검사 결과표===");
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		if (isMarried == true) {
			System.out.println("결혼유무 : 기혼");
		}else{
			System.out.println("결혼유무 : 미혼");
		}
		
		if (30>= age && age>= 20 && isMarried == false) {
			System.out.println("징집검사 결과 합격입니다.. ");
		}else{
			System.out.println("징집검사 결과 불합격입니다..");
		}
		
		System.out.println("=================\r\n");
	}
}
