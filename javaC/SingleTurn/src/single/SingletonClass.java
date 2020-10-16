package single;

/*
 *  Singleton: 하나의 instance에 접근하여 데이터를 송수신 할 수 있는 Pattern
 */

public class SingletonClass {
	
	private static SingletonClass sc = null;
	
	public int snumber;
	
	public SingletonClass() {
		
	}
	public static SingletonClass getInstance() {   //null이었을 때 힌번 들어오고 그 다음부터는 똑같은 하나의 값만 계속 넘어온다 그래서 싱글턴
		if(sc == null) {
			sc = new SingletonClass();
		}
		return sc;
		
		
	}

}
