package TestngEx;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParaEx {
@Test
@Parameters({"pname"})
public void data(@Optional("ashuu") String name) {
	System.out.println(name);
}
@Test(priority=1)
public void data1() {
	System.out.println("hi");
}
}
