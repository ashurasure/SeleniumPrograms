package TestngEx;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterEx {
	@Test
	@Parameters("name")
public void login(@Optional("sweet") String name) {
	System.out.println("name: "+name);
}
}
