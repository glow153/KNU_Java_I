package practice_8th_week.problem03;

public class Donator {
	public boolean donate(int amount) {
		if(amount > 20) {
			System.out.println("��α��� 1ȸ 20���� ���ϸ� �����մϴ�.");
			return false;
		}
		DonationCenter.donation += amount;
		return true;
	}
}
