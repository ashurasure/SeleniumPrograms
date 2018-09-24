package javaLearning;
class student{
	private int roll_no;
	private String name;
	String subject;
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//public void subject(String string) {
		// TODO Auto-generated method stub
		
	
}
public class EncapEx {
public static void main(String args[]) {
	student s=new student();
	s.setRoll_no(2);
	s.getRoll_no();
	s.setName("ashu");
	System.out.println(s.getName());
	//s.subject("maths");
	
}
}
