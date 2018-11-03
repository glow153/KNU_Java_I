package week13_3;

import java.util.Random;

public class Words {
	Random random = new Random();
	
	String[] words = {"java", "import", "class", "public", "private", 
			"overloading", "method", "inheritance", "encapsulation", "polymorphism"};
	
	// 단어를 임의로 추출
	public String getWord() {
		return words[random.nextInt(words.length-1)];
	}
	
	// 입력받은 index의 단어를 추출
	public String getWord(int mIndex) {
		return words[mIndex];
	}
}
