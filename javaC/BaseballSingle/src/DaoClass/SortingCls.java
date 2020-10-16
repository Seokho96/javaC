package DaoClass;

import java.util.ArrayList;

import DaoInterface.DaoImpl;
import dto.Batter;
import dto.Human;
import singleton.SingletonCls;

public class SortingCls implements DaoImpl{
	
	public void batterHitRanking() {
		
		SingletonCls sc = SingletonCls.getInstance();
		// 타자만을 수집한 배열
	//	Human chuman[] = positionSelect(2);
		ArrayList<Human> sortList = positionSelect(2);
		
		// 확인용
		System.out.println("타자만으로 출력용 -----");
	
		for (int i = 0; i < sortList.size(); i++) {
			System.out.println(sortList.get(i).toString());
		}		
		

		Human obj = null;
		for (int i = 0; i < sortList.size() - 1; i++) {
			for (int j = i + 1; j < sortList.size(); j++) {
				Batter b1 = (Batter)sortList.get(i);
				Batter b2 = (Batter)sortList.get(j);
				if(b1.getHitAvg() < b2.getHitAvg()) {
					obj = sortList.get(i);
					sortList.set(i, sortList.get(j));
					sortList.set(j, obj);
				}
			}
		}		
		
		// 결과 출력
		System.out.println("정렬 후 타자만으로 결과 출력용 -----");
	/*	for (int i = 0; i < chuman.length; i++) {
			System.out.println(chuman[i].toString());
		}*/
		
		for (Human human : sortList) {
			System.out.println(human.toString());
		}
	}

	public ArrayList<Human> positionSelect(int num) {

		ArrayList<Human> reList = new ArrayList<Human>();
		
		for (int i = 0; i < list.size(); i++) {
			Human human = list.get(i);
			if(num == 1) {		// pitcher
				if(human.getNumber() < 2000) {
					reList.add(human);
				}				
			}
			else if(num == 2) {	// batter
				if(human.getNumber() >= 2000) {
					reList.add(human);
				}
			}
		} 
		return reList;
	}
	
	
	@Override
	public void process() {
		// TODO Auto-generated method stub
		
	}

}
