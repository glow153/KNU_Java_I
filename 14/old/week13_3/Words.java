package week13_3;

import java.util.Random;

public class Words {
	Random random = new Random();
	
	String[] words = {"java", "import", "class", "public", "private", 
			"overloading", "method", "inheritance", "encapsulation", "polymorphism"};
	
	// �ܾ ���Ƿ� ����
	public String getWord() {
		return words[random.nextInt(words.length-1)];
	}
	
	// �Է¹��� index�� �ܾ ����
	public String getWord(int mIndex) {
		return words[mIndex];
	}
}
