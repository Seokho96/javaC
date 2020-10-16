package factory;

import animal.Animal;
import animal.cat;
import animal.cow;
import animal.dog;


public class AnimalFactory {
	
	public static Animal create(String animalName) {
		
		if(animalName.equals("")) {
			System.out.println("생성할 클래스가 없습니다");
		}
		else if(animalName.equals("야옹이")) {
			return new cat();
		}
		else if(animalName.equals("멍멍이")) {
			return new dog();
		}
		else if(animalName.equals("황소")) {
			return new cow();
		}
		return null;
	}

}
