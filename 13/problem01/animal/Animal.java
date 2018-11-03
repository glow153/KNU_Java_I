package practice_13th_week.problem01.animal;

public abstract class Animal {
	protected abstract void name();
	protected abstract void classification();
	protected abstract void legs();
	protected abstract void taste();
	protected abstract void backbone();
	protected abstract void temp();
	
	public void description() {
		name();
		System.out.println("<세부 정보>");
		classification();
		legs();
		taste();
		System.out.println("<특성 분류>");
		backbone();
		temp();
	}
}
