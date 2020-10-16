package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DaoInterface.DaoImpl;
import dto.Batter;
import dto.Human;
import dto.Pitcher;
import dao.Dao;

public class Dao {
	
private static Dao sc = null;
	
	public List<Human> list = null;
	
	private Dao() {
		list = new ArrayList<Human>();
	}
	
	public static Dao getInstance() {
		if(sc == null) {
			sc = new Dao();
		}
		return sc;
	}
	
	

}
 class InsertClass implements DaoImpl {
	Scanner scan = new Scanner(System.in);
	
	private int memberNumber;
	
	public InsertClass() {
		Dao sc = Dao.getInstance();		
		memberNumber = sc.list.get( sc.list.size() - 1 ).getNumber();
		
		if(memberNumber >= 2000) {
			memberNumber = memberNumber - 1000;
		}
		memberNumber = memberNumber + 1;
	}
	
	@Override
	public void process() {		
		Dao sc = Dao.getInstance();
		
		// 투수/타자 ?
		System.out.print("투수(1)/타자(2) = ");
		int pos = scan.nextInt();
		
		// human
		System.out.print("이름 = ");
		String name = scan.next();
		
		System.out.print("나이 = ");
		int age = scan.nextInt();
		
		System.out.print("신장 = ");
		double height = scan.nextDouble();
		
		if(pos == 1) {
			// win
			System.out.print("승 = ");
			int win = scan.nextInt();
			
			// lose
			System.out.print("패 = ");
			int lose = scan.nextInt();
			
			// defense
			System.out.print("방어율 = ");
			double defence = scan.nextDouble();
			
			sc.list.add(new Pitcher(memberNumber, name, age, height, win, lose, defence));
			
		}		
		// 타자  2000 ~ 
		else if(pos == 2) {
			
			Batter bat = new Batter();
			
			// 선수 등록 번호
			bat.setNumber(memberNumber + 1000);
			bat.setName(name);
			bat.setAge(age);
			bat.setHeight(height);			
						
			// 타수
			System.out.print("타수 = ");
			int batcount = scan.nextInt();
			bat.setBatcount(batcount);
						
			// 안타수
			System.out.print("안타수 = ");
			int hit = scan.nextInt();
			bat.setHit(hit);
			
			// 타율
			System.out.print("타율 = ");
			double hitAvg = scan.nextDouble();
			bat.setHitAvg(hitAvg);
			
			sc.list.add(bat);
		}
	}

}

 class DeleteClass implements DaoImpl {
	Scanner scan = new Scanner(System.in);
	
	public DeleteClass() {
	}
	
	@Override
	public void process() {
		Dao sc = Dao.getInstance();

		System.out.print("삭제하고 싶은 선수명 입력 = ");
		String name = scan.next();
		
		if(name.equals("")) {
			System.out.println("이름을 정확히 입력해 주십시오.");
			return;		// continue
		}
		
		int findIndex = SelectClass.search(name);
		if(findIndex == -1) {
			System.out.println("선수 명단에 없습니다. 삭제할 수 없습니다");
			return;
		}
		
		Human h = sc.list.remove(findIndex);
		
		System.out.println(h.getName() + "의 데이터는 삭제되었습니다");
	}

}
 class SelectClass implements DaoImpl {
	Scanner scan = new Scanner(System.in);
	
	@Override
	public void process() {
		Dao sc = Dao.getInstance();

		System.out.print("검색하고 싶은 선수명 = ");
		String name = scan.next();
		
		int findIndex = search(name);
		if(findIndex == -1) {
			System.out.println("선수 명단에 없습니다.");
		}
		else {
			Human human = sc.list.get(findIndex);
			
			System.out.println("번호:" + sc.list.get(findIndex).getNumber());
			System.out.println("이름:" + human.getName());
			System.out.println("나이:" + human.getAge());
			System.out.println("신장:" + human.getHeight());
			
			if(human instanceof Pitcher) {
				System.out.println("승리:" + ((Pitcher)human).getWin() );
				System.out.println("패전:" + ((Pitcher)human).getLose() );
				System.out.println("방어율:" + ((Pitcher)human).getDefence() );
			}
			else if(human instanceof Batter){
				System.out.println("타수:" + ((Batter)human).getBatcount() );
				System.out.println("안타수:" + ((Batter)human).getHit() );
				System.out.println("타율:" + ((Batter)human).getHitAvg() );			
			}			
		}
	}
	
	public static int search(String name) {
		Dao sc = Dao.getInstance();
		
		int index = -1;
		for (int i = 0; i < sc.list.size(); i++) {
			Human h = sc.list.get(i);
			if(name.equals(h.getName())) {
				index = i;
				break;
			}
		}
		return index;
	}

}

 class UpdateClass implements DaoImpl {
	Scanner scan = new Scanner(System.in);
	
	public UpdateClass() {
	}
	
	@Override
	public void process() {
		Dao sc = Dao.getInstance();

		System.out.print("수정하고 싶은 선수명 = ");
		String name = scan.next();
		
		int findIndex = SelectClass.search(name);
		if(findIndex == -1) {
			System.out.println("선수 명단에 없습니다.");
			return;
		}
		
		Human human = sc.list.get(findIndex);
		
		if(human instanceof Pitcher) {
			System.out.print("승 = ");
			int win = scan.nextInt();
			
			System.out.print("패 = ");
			int lose = scan.nextInt();
			
			System.out.print("방어율 = ");
			double defence = scan.nextDouble();
			
			Pitcher pit = (Pitcher)human;
			pit.setWin(win);
			pit.setLose(lose);
			pit.setDefence(defence);			
		}
		else if(human instanceof Batter) {
			System.out.print("타수 = ");
			int batcount = scan.nextInt();
			
			System.out.print("안타수 = ");
			int hit = scan.nextInt();
			
			System.out.print("타율 = ");
			double hitAvg = scan.nextDouble();
			
			Batter bat = (Batter)human;
			bat.setBatcount(batcount);
			bat.setHit(hit);
			bat.setHitAvg(hitAvg);			
		}
		
	}

}

 class AllPrint implements DaoImpl {

	public AllPrint() {
	}
	
	@Override
	public void process() {
		Dao sc = Dao.getInstance();
		
		for (int i = 0; i < sc.list.size(); i++) {
			Human human = sc.list.get(i);
			System.out.println(human.toString());
		}

	}

}