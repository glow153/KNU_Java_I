package practice_13th_week.problem01.animal;

public class Snail extends Animal {

	@Override
	protected void name() {
		// TODO Auto-generated method stub
		System.out.println("*** 이름 : 달팽이");
	}

	@Override
	protected void classification() {
		// TODO Auto-generated method stub
		System.out.println("분류 : 연체동물");
	}

	@Override
	protected void legs() {
		// TODO Auto-generated method stub
		System.out.println("다리 개수 : 0");
	}

	@Override
	protected void backbone() {
		// TODO Auto-generated method stub
		System.out.println("무척추동물");
	}

	@Override
	protected void temp() {
		// TODO Auto-generated method stub
		System.out.println("변온동물");
	}

	@Override
	protected void taste() {
		// TODO Auto-generated method stub
		System.out.println("식성 : 초식");
	}
	
}
