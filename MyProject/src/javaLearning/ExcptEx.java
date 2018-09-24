package javaLearning;

public class ExcptEx {
  public void sub(int i) {
	    // int i=18;
		if(i<18) 
			throw new ArithmeticException("cant vote"); 	
			else
			{
				System.out.println("can vote");
			}
  }
	 // return i;
	public static void main(String[] args) {
		ExcptEx ex=new ExcptEx();
			try
			{
				ex.sub(17); 
			}
			catch(ArithmeticException e){
				System.out.println();
			}
			System.out.println("done");
	}
}
