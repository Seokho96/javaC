package game;

public class gbbGame {

	private int userNum;
	private int comNum;
	private int win, lose, draw;
	private int result;
	
	public gbbGame() {
		win = lose = draw = 0;
	}
	
	public void init() {
		comNum = (int)(Math.random() * 3);	// 0, 1, 2		
	}
	
	public String play() {	// win, lose, draw
		String msg = "";
		
		/*
		// win
		// 0 == 가위 1 == 바위 2 == 보		
		if(userNum == 0 && comNum == 2) {}
		else if(userNum == 1 && comNum == 0) {}
		else if(userNum == 2 && comNum == 1) {}
		
		0 2
		1 0
		2 1
		
		// lose
		if(userNum == 2 && comNum == 0) {}
		else if(userNum == 0 && comNum == 1) {}
		else if(userNum == 1 && comNum == 2) {}
		
		
		
		// draw
		if(userNum == 0 && comNum == 0) {}
		else if(userNum == 1 && comNum == 1) {}
		else if(userNum == 2 && comNum == 2) {}
		
		p c		--- win
		0 2
		1 0
		2 1
		
		com 	player
		2	- 	0 		+ 2		= 4 % 3	-> 1
		0   -   1       + 2     = 1 % 3 -> 1
		1   -   2       + 2     = 1 % 3 -> 1
		
		c p
		2 0
		0 1
		1 2
		
		0   -   2       + 2     = 0 % 3 -> 0
		1   -   0       + 2     = 3 % 3 -> 0
		2   -   1       + 2     = 3 % 3 -> 0 		
		
		0 0 
		1 1
		2 2
		
		0   -   0       + 2     = 2 % 3 -> 2
		1   -   1       + 2     = 2 % 3 -> 2
		2   -   2       + 2     + 2 % 3 -> 2        
		
		*/
		
		
		result = (comNum - userNum + 2) % 3;
		
		switch(result) {
			case 1:
				win++;
				msg = "승리!!!";
				break;
			case 0:
				lose++;
				msg = "패배~";
				break;
			case 2:
				draw++;
				msg = "무승부-";
				break;		
		}
		
		return msg;		
	}

	public int getWin() {
		return win;
	}

	public int getLose() {
		return lose;
	}

	public int getDraw() {
		return draw;
	}
	
	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}
	
	public String getUser() {
		String userChoice = "";
		
		switch(userNum) {
			case 0:
				userChoice = "가위";
				break;
			case 1:
				userChoice = "바위";
				break;
			case 2:
				userChoice = "보";
				break;		
		}
		return userChoice;
	}
	
	public String getCom() {
		String comChoice = "";
		
		switch(comNum) {
			case 0:
				comChoice = "가위";
				break;
			case 1:
				comChoice = "바위";
				break;
			case 2:
				comChoice = "보";
				break;		
		}
		return comChoice;
	}
	
}






