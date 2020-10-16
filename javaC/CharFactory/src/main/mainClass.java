package main;

import person.Person;
import types.Atype;
import types.Btype;

public class mainClass {

	public static void main(String[] args) {
		
		Person char1 = new Person();
		char1.create(new Btype());
		
		char1.m_Weapon.drawWeapon();
		char1.m_Bomb.drawBomb();
		
	}

}






