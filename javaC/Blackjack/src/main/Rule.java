package main;

public class Rule {
	
	
	public Rule(){
		
		
	    
	}

	public void rule() {
		
		System.out.println("랜덤 숫자의 합이 21또는 21에 가장 가까운 수를 가지는 쪽이 이기는 게임입니다.");
	    System.out.println("이기면 건 코인의 2배, 지면 베팅한 코인이 사라집니다.");
	    System.out.println("Hit : 추가 카드를 받습니다.      Stay : 추가 카드를 받지 않습니다. ");
	    System.out.println("1. 먼저  코인을 베팅합니다.  \n2. 유저와 컴퓨터 각각 (랜덤)숫자를 1개씩 받습니다. ");
	    System.out.println("3. 컴퓨터 숫자를 하나 오픈합니다. \n4. 유저는 매턴 'Hit' 와 'Stay' 를 선택합니다. 컴퓨터는 17이 될 때까지 Hit만 합니다. ");
	    System.out.println("※ 첫 두개의 숫자의 합이 21이면 'BlackJack' 입니다. 21을 받은쪽이 바로 승리합니다. \n21을 초과하게 되면  'Bust' 입니다. 유저의 패배로 베팅한 코인을 모두 잃습니다.");
	    System.out.println("(※게임의 속도를 위해 본게임은 하나씩 받습니다.)");
	}

}
