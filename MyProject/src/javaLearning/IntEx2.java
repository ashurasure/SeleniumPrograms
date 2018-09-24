package javaLearning;
interface B{
	void m2();
}
abstract class C {
	public void m2() {
		System.out.println("hii");
	}
}
public class IntEx2 extends C implements B{
public void m3() {
	System.out.println("World");
}
	public static void main(String[] args) {
		new IntEx2().m2();
		new IntEx2().m3();
	}

}
