package javaLearning;

import java.util.ArrayList;

public class ArrLst2 {
public static void main(String args[]) {
	ArrayList a=new ArrayList();
	a.add(1);
	a.add(6);
	a.add(5);
	a.add(2);
	ArrayList a1=new ArrayList();
	a1.add(1);
	a1.add(2);
	a1.add(3);
	a1.add(4);
	System.out.println(a);
	System.out.println(a1);
	a.removeAll(a1);
	a.addAll(a1);
	System.out.println(a);
}
}
