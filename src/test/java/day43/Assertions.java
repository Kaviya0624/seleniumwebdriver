package day43;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions
{
	
	@Test
	void testtilte()
	{
		String exp_title = "kaviya";
		String act_title = "kavia";
		
		Assert.assertEquals(exp_title, act_title);
	}

}
