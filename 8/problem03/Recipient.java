package practice_8th_week.problem03;

public class Recipient {
	public void receipt() {
		DonationCenter.donation -= 8;
		if(DonationCenter.donation < 0) {
			DonationCenter.donation = 0;
		}
	}
}
