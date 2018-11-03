package practice_9th_week.problem03_old_old;

public class OrderSheet {
	private Beverage[] beverageList;
	int totalAmount;
	
	public OrderSheet(Beverage[] beverageList) {
		this.beverageList = beverageList;
		calcTotalAmount();
	}
	
	private int calcTotalAmount() {
		totalAmount = 0;
		
		for (Beverage b : beverageList) {
			int price = 0;
			if (b == null)
				break;
			
			if(b.getType().equals("�Ƹ޸�ī��")) {
				price = 2000;
			} else if(b.getType().equals("�ٴҶ��")) {
				price = 3000;
			} else if(b.getType().equals("ī��Ḷ���ƶ�")) {
				price = 4000;
			}
			
			if (b.isIce())
				price += 200;
			
			totalAmount += price * b.getCount();
		}
		return totalAmount;
	}
	
	public int getTotalAmount() {
		return totalAmount;
	}
	
	public int getMileage() {
		return (int)(totalAmount * 0.05);
	}
}
