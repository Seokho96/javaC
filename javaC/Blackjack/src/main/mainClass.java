package main;

import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Rule r = new Rule();
		Game g = new Game();
		Random ra = new Random();
		boolean a;
		while(a = true) {	
		System.out.println("============블랙잭===============");
		System.out.println("0. 규칙보기");
		System.out.println("1. 게임시작");
		System.out.print("=> ");

		int choose = sc.nextInt();

		switch(choose) {
		
		case 0 :
			r.rule();
			break;	
		case 1:
			g.remove();
			g.coin();
			g.choose();
			a = false;
			break;
			

		}
		}
		
	}

}
