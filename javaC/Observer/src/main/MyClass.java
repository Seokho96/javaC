package main;

import java.util.Observable;

public class MyClass extends Observable {   //Human(Baseball에서)
	
	private String preArg = null;
	
	private String id;
	private String password;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void notifyObservers(Object arg) {
		
		String str = (String)arg;
		//변화가 없다 -> 통지 안함.
		if(str.equals(preArg)) return;
		
		// 변호가 있음
		preArg = str;
		
		setChanged(); // reset
		
		super.notifyObservers(arg);
		
		clearChanged();
	}
	
	//일반 메소드
	
	

}
