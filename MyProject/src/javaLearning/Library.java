package javaLearning;

public class Library {
	public void science() {
		System.out.println("science books...");
	}
 void arts() {
	System.out.println("arts books...");
}
protected void commerce() {
	System.out.println("commerce");
}
private void general(){
	System.out.println("general books");
}
	public static void main(String[] args) {
		Library l=new Library();
		l.science();
		l.arts();
		l.commerce();
		l.general();
	}

}
