package javaLearning;

import java.util.Arrays;
import java.util.Collections;

public class ArrEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer[] Arr = {10,4,12,23,9,3};
Arrays.sort(Arr);
System.out.println(Arrays.toString(Arr));
Arrays.sort(Arr,Collections.reverseOrder());
//Arrays.sort
System.out.println(Arrays.toString(Arr));
	}

}
