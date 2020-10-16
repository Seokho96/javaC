package main;

import hcls.HeClass;
import mcls.MyClass;
import single.SingletonClass;
import ycls.YouClass;

public class mainClass {
	public static void main(String[] args) {
		
		MyClass mcls = new MyClass();
		YouClass ycls = new YouClass();
		HeClass hcls = new HeClass();
		
		/*
		int n = mcls.getNumber();
		ycls.setTag(n);
		 */
		mcls.method();
		ycls.func();
		hcls.function();
		
		System.out.println( hcls.toString());
		/*
		SingletonClass sc = SingletonClass.getInstance();
		System.out.println("sc: "+ sc);
		SingletonClass scTag = SingletonClass.getInstance();
		System.out.println("sc: "+ scTag);
		SingletonClass single = SingletonClass.getInstance();
		System.out.println("sc: "+ single);
	 */
	
	
	
	
	}

}
