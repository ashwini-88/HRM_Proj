package maven_Practice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_01 {

	@Test(groups = "smoke")
	private void Ts_01() {
		System.out.println("---Test Script_01 is Executed---");
		WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.facebook.com/");
	}
}
