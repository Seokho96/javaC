package DaoClass;

import DaoInterface.DaoImpl;
import dto.Human;
import singleton.SingletonCls;

public class AllPrint implements DaoImpl {

	public AllPrint() {
	}
	
	@Override
	public void process() {
		SingletonCls sc = SingletonCls.getInstance();
		
		for (int i = 0; i < sc.list.size(); i++) {
			Human human = sc.list.get(i);
			System.out.println(human.toString());
		}

	}

}








