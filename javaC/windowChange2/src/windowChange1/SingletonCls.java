package windowChange1;

public class SingletonCls {   //delegate
	
	private static SingletonCls sc = null;
	
	WIndowone one;
	WindowTwo two;
	
	
	
	private SingletonCls() {
		one = new WIndowone();
		two = new WindowTwo();
	}
	public static SingletonCls getInstance() {
		if(sc == null) {
			sc = new SingletonCls(); 
		}
	   return sc;
	}

}
