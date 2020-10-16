package mcls;

import single.SingletonClass;

public class MyClass {
	private int number;
		
	public MyClass() {
		number =12;
	}

	/*
	 * public int getNumber() { return number; }
	 */
	
	public void method() {
		SingletonClass sc = SingletonClass.getInstance();
		this.number = sc.snumber ;
	}

	

}
