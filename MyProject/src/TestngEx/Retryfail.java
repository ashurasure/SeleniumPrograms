package TestngEx;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Retryfail {
@Test
public void t1() {
	System.out.println("t1");
}
@Test
public void t2() {
	System.out.println("t2");
}
@Test
public void t3() {
	System.out.println("t3");
	Assert.assertTrue(2>1);
}
}
