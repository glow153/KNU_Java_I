package practice_7th_week.problem02;

public class SemesterGrade {
	private String[] subject = new String[7];
	private int[] credit = new int[7];
	private double[] grade = new double[7];
	private int idx = 0;
	
	public void insert(String sbjName, int sbjCredit, double sbjGrade) {
		subject[idx] = sbjName;
		credit[idx] = sbjCredit;
		grade[idx] = sbjGrade;
		idx++;
	}
	
	public double getAverageGrade() {
		double avg = 0.0;
		double sumGrade = 0.0;
		int sumCredit = 0;
		for(int i=0;i<7;i++){
			sumGrade += credit[i] * grade[i];
			sumCredit += credit[i];
		}
		avg = sumGrade / sumCredit;
		return avg;
	}
}
