package javaLearning;

import java.util.ArrayList;

public class ArrListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> l=new ArrayList<Integer>();
ArrayList<Integer> l2=new ArrayList<Integer>();
l.add(10);
l.add(20);
l.add(30);
l.add(3,0);
System.out.println(l);
l.addAll(0,l2);
System.out.println(l2);
	}

}
