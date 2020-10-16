package main;

import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.List;

import animal.Animal;
import animal.cat;
import animal.cow;
import animal.dog;
import factory.AnimalFactory;

public class mainClass {
	public static void main(String[] args) {
		
		/*  
		 *   Singleton Pattern
		 *     중심이 되는 데이터 관리 template(list, map)을 중심으로
		 *     어느 클래스에서나 접근이 용의하게 하기 위한 패턴
		 *     instance가 한개의 의미.
		 *     
		 *     Factory Pattern 공장 -> Object
		 *        원하는 클래스의 형태를 생성하기 위한 패턴
		 *       
		 *     interface, class 동물
		 *     
		 *     class   고양이, 멍멍이, 황소
		 *     
		 *     Animal ani = new Cat();
		 *    
		 * 
		 */
		
		Animal ani1 = AnimalFactory.create("멍멍이");
		Animal ani2 = AnimalFactory.create("야옹이");
		Animal ani3 = AnimalFactory.create("황소");
		
		ani1.printDescript();
		ani2.printDescript();
		ani3.printDescript();
		
		((dog)ani1).dogMethod();
		
		List<Animal> list = new ArrayList<Animal>();
		
		Animal ani = null;
		
	    String aname[] = { "황소", "황소", "야옹이", "멍멍이", "멍멍이"};
	    for (int i = 0; i < aname.length; i++) {
			ani = AnimalFactory.create(aname[i]);
		    list.add(ani);
	    }
		/*
		ani = AnimalFactory.create("황소");
		list.add(ani);
		ani = AnimalFactory.create("황소");
		list.add(ani);
		ani = AnimalFactory.create("야옹이");
		list.add(ani);
		ani = AnimalFactory.create("멍멍이");
		list.add(ani);
		ani = AnimalFactory.create("멍멍이");
		list.add(ani);
		*/
	    
	    for (int i = 0; i < list.size(); i++) {
		   Animal a = list.get(i);
		   a.printDescript();
		   
		   if( a instanceof cat) {
			   ((cat)a).catMethod();
		   }
		   else if( a instanceof dog) {
			   ((dog)a).dogMethod();
		   }
		   else if( a instanceof cow) {
			   ((cow)a).cowMethod();
		   }
		}
		
	}

}













