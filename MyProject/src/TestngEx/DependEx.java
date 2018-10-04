package TestngEx;

import org.testng.annotations.Test;

public class DependEx {
@Test(priority=1)
public void t1() {
	System.out.println("t1");
}
@Test
public void t3() {
	System.out.println("t3");
}
@Test(dependsOnMethods= {"t3","t1"})
public void t2() {
	System.out.println("t2");
}
}
