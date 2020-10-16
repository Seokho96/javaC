package hcls;

import single.SingletonClass;

public class HeClass {
	
	private int num;
	
	public void function() {
		SingletonClass sc = SingletonClass.getInstance();
		this.num = sc.snumber;
	}
	public String toString() {
		return "HeClass [tag=" + num + "]";
	}

}
