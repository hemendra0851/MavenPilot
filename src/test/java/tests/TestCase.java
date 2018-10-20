package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase {

	@Test
	public void a(){
		
		System.out.println("\n**********************\nTest Started\n**********************\n");
		Assert.assertEquals('A', 'A');
		System.out.println("\n**********************\nTest Ended\n**********************\n");
	}
	
}
