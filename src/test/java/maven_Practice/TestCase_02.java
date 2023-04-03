package maven_Practice;

import org.testng.annotations.Test;

public class TestCase_02 {
	@Test(groups = "regression")
	private void Ts_02() {
		System.out.println("---Test Script_02 is Executed---");

	}
	
	@Test(groups = "smoke")
	private void Ts_03() {
		System.out.println("---Test Script_03 is Executed---");

	}
}
