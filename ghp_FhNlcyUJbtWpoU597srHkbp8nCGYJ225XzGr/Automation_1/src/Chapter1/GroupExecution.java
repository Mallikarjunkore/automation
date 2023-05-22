package Chapter1;

import org.testng.annotations.Test;

public class GroupExecution {
	
	@Test(groups="smoke")
	public void hello()
	{
		System.out.println("smoke");
	}
	
	@Test(groups="sanity")
	public void hello1()
	{
		System.out.println("sanity");
	}

}
