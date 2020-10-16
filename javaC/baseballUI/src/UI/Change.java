package UI;



public class Change {
private static Change cg = null;
	
	MainMenu one;
	InsertMenu two;
	DeleteMenu three;
	SelectMenu four;
	UpdateMenu five;
	AllprintMenu six;
	SaveMenu seven;
	
	
	private Change() {
		one = new MainMenu();
		two = new InsertMenu();
		three = new DeleteMenu();
		four = new SelectMenu();
		five = new UpdateMenu();
		six = new AllprintMenu();
		seven = new SaveMenu();
		
	}
	public static Change getInstance() {
		if(cg == null) {
			cg = new Change(); 
		}
	   return cg;
	}

}
