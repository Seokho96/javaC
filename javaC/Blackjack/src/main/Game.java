package main;

import java.util.Scanner;

public class Game {
	static Scanner sc = new Scanner(System.in);
	static Random r = new Random();
    static int ucoin = 100;
    static int coin;
    
   
    public static void remove() {
    	for (int j = 0; j < r.uran.size(); j++) {
    		r.uran.set(j, 0);
    		for (int i = 0; i < r.cran.size(); i++) {
    			
    			r.cran.set(i, 0);
			}
    		
		}
    }  
    public static void coin() {
    	
    	System.out.println(" 베팅할 코인을 입력해주세요 현재 코인: " + ucoin); 
    	System.out.print("=> ");
    	
    	coin = sc.nextInt();
    	
    	ucoin = ucoin - coin;
    	
    	r.ran();
    }
      
    public void choose () {
	  		
  while( isCheck() == false) {
		  
	System.out.println();

		    System.out.println("1. Hit(숫자 추가)          2.Stay(턴을 넘김) ");
		    System.out.print("=> ");
		int turn = sc.nextInt();
		if(turn == 1) {
			r.plusRan();
			
		}else if(turn == 2){
			
			r.cran.add((int)(Math.random()*10)+1);
		}
		
		
}
	}
	
	
	public boolean isCheck() {
		
		int c = r.uran.get(0);
		int a = r.cran.get(0);
		for (int i = 1; i < r.cran.size(); i++) {
			for (int j = 1; j < r.uran.size(); j++) {
				c  = c + r.uran.get(j) ;
				 a = a + r.cran.get(i);
			}		 
		}
		if(a > 21 || c == 21) {
			System.out.println("유저 승리!");
			ucoin = ucoin + (coin * 2);
		//	System.out.println("컴퓨터의 합은 :" + a);
			
			return true;
		}
		else if(a == 21 || c > 21) {
			System.out.println();
			System.out.println("컴퓨터 승리!");
			ucoin = ucoin - coin;
			System.out.println("컴퓨터의 합은 :" + a);
		
			return true;
		}else 
			
			return false;
		
		
	}

}








