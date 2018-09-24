package TestngEx;
import org.testng.annotations.Test;


public class GroupingDemo {
@Test(groups="regression")
public void test1()
{
	System.out.println("test1");
}
@Test(groups= {"regression","sanity"})
public void test2()
{
	System.out.println("test2");
}
@Test(groups="smoke")
public void test3()
{
	System.out.println("test2");
}
@Test(groups={"regression","smoke"})
public void test4()
{
	System.out.println("test4");
}}
