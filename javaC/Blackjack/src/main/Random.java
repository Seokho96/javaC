package main;

import java.util.ArrayList;

public class Random{
	static int c = 2;
	static ArrayList<Integer> cran = new ArrayList<Integer>();
	
	static ArrayList<Integer> uran = new ArrayList<Integer>();
	public Random() {
		
	}
	
	public static void ran() {
		
		
		cran.add((int)(Math.random()*10)+1);
	//	cran.add((int)(Math.random()*10)+1);
		
		System.out.println("컴퓨터의 2개의 숫자중 하나는 " + cran.get(0) + " 입니다");
	//	System.out.println();
		
		
		uran.add((int)(Math.random()*10)+1);
	//	uran.add((int)(Math.random()*10)+1);
		
		System.out.println("유저의 번호는 " + uran.get(0)+"입니다.");
	}

	public static void plusRan() {
		
		cran.add((int)(Math.random()*10)+1);
		
		uran.add((int)(Math.random()*10)+1);
		

		
		System.out.println("현재 보유 번호는 ");
		for (int i = 0; i < uran.size(); i++) {
			System.out.print(uran.get(i)+ ", ");
		}
		
	}
	

}






