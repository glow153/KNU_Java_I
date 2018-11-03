package practice_13th_week.problem01;

import practice_13th_week.problem01.animal.Animal;
import practice_13th_week.problem01.animal.Grasshopper;
import practice_13th_week.problem01.animal.Lion;
import practice_13th_week.problem01.animal.Pigeon;
import practice_13th_week.problem01.animal.Shark;
import practice_13th_week.problem01.animal.Snail;

public class AnimalKingdom {
	private Animal[] animals = null;
	
	public AnimalKingdom() {
		animals = new Animal[5];
		animals[0] = new Lion();
		animals[1] = new Shark();
		animals[2] = new Pigeon();
		animals[3] = new Grasshopper();
		animals[4] = new Snail();
		
		System.out.println("동물의 왕국 시작!");
	}
	
	public void describe() {
		for(Animal a : animals)
			a.description();
	}
}
