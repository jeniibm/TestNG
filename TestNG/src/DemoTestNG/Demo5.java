package DemoTestNG;

import org.testng.annotations.Test;

public class Demo5 {
	
	@Test(priority=1)
	public void Lion()
	{
		System.out.println("Lion");
	}

	@Test(priority=2)
	public void Elephant()
	{
		System.out.println("Elephant");
	}
	
	@Test(priority=3)
	public void Tigger()
	{
		System.out.println("Tigger");
	}
	@Test
	public void A()
	{
		System.out.println("A");
	}
	@Test
	public void B()
	{
		System.out.println("B");
	}
}
