package practice_8th_week.problem03;

public class Donator {
	public boolean donate(int amount) {
		if(amount > 20) {
			System.out.println("기부금은 1회 20만원 이하만 가능합니다.");
			return false;
		}
		DonationCenter.donation += amount;
		return true;
	}
}
