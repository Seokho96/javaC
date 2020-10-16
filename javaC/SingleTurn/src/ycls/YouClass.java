package ycls;

import single.SingletonClass;

public class YouClass {
	private int tag;
	
	public YouClass() {
		tag = 1;
	}

	/*
	 * public void setTag(int tag) { this.tag = tag; }
	 */

	public void func() {
		SingletonClass sc = SingletonClass.getInstance();
		 sc.snumber = this.tag ;
	}
	
	@Override
	public String toString() {
		return "YouClass [tag=" + tag + "]";
	}
  
}
