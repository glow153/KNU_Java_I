package practice_13th_week.problem01.animal;

public class Pigeon extends Animal {

	@Override
	protected void name() {
		// TODO Auto-generated method stub
		System.out.println("*** 이름 : 비둘기");
	}

	@Override
	protected void classification() {
		// TODO Auto-generated method stub
		System.out.println("분류 : 조류");
	}

	@Override
	protected void legs() {
		// TODO Auto-generated method stub
		System.out.println("다리 개수 : 2");
	}

	@Override
	protected void backbone() {
		// TODO Auto-generated method stub
		System.out.println("척추동물");
	}

	@Override
	protected void temp() {
		// TODO Auto-generated method stub
		System.out.println("정온동물");
	}

	@Override
	protected void taste() {
		// TODO Auto-generated method stub
		System.out.println("식성 : 잡식");
	}
	
}
