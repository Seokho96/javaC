package main;

public class mainClass {
	public static void main(String[] args) {
		
		NameCard ncard = new NameCard("홍길동", "123-123", "asas@aas.com");
		
		ncard.setPrintNameCard(new PrintNameCard2());
		ncard.print();
	} 

}
