package person;

import java.util.ArrayList;

import bomb.Bomb;
import types.AbstractItem;
import weapon.Weapon;

public class Person {

	public Weapon m_Weapon;
	public Bomb m_Bomb;
	
	public void create(AbstractItem ai) {
		ArrayList<Person> list = new ArrayList<Person>();
		Weapon w;
		m_Weapon = ai.createWeapon();
		m_Bomb = ai.createBomb();
		list.addAll(w.drawWeapon());
		
	}		
	
}




