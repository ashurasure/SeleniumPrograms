package javaLearning;

public class ExcpetnEx {
	public static void main(String[] args) {
		try 
		{
		int a=10/0;	
		}
		catch(ArithmeticException e){
			System.out.println("arithmetic exception occcured");
		}
finally {
	System.out.println("handled");
}
	}

}
