package TestngPractice;

import org.testng.annotations.Test;

public class NewTest {
  @Test(priority=2,invocationCount=2,enabled=false)
  public void test() {
	  System.out.println("testcase 1");
  }
  
  @Test(priority=1,invocationCount=3)
  public void test1()
  {
	  System.out.println("test case2");
  }
  @Test
  public void test2()
  {
	  System.out.println("nothing");
  }
}
