package TestngEx;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreEx {
@Test

public void m() {
	System.out.println("m");
}
@Test
@Ignore
public void n() {
	System.out.println("n");
}
@Test
public void o() {
	System.out.println("o");
}
}
