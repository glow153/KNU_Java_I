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
		System.out.println("<���� ����>");
		classification();
		legs();
		taste();
		System.out.println("<Ư�� �з�>");
		backbone();
		temp();
	}
}
