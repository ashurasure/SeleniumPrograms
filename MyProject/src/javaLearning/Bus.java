package javaLearning;

public class Bus extends Library{
public static void main(String args[]) {
	Library l=new Library();
	l.science();
	l.arts();
	l.commerce();
	Bus b=new Bus();
	b.science();
}
}
