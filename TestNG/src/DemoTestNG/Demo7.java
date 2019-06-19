package DemoTestNG;

import org.testng.annotations.Test;

public class Demo7 {
	@Test(groups={"smoke"},priority=1)
	public void test1()
	{
		System.out.println("Smoke test1");
	}
	@Test(groups={"smoke"},priority=2)
	public void test2()
	{
		System.out.println("Smoke test2");
	}
	@Test(groups={"regression"})
	public void test3()
	{
		System.out.println("Regression test3");
	}
}
