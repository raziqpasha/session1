package day1;

import org.testng.annotations.Test;

public class ThridTestCase {
	@Test(groups= {"functional"})
	void functional1() {
		System.out.println("this is functional 1");
	}

		@Test(groups= {"functional"})
	void functional2() {
		System.out.println("this is functional 2");
	}

	
}
