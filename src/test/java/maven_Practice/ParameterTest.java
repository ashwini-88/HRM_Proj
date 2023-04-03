package maven_Practice;

import org.testng.annotations.Test;

public class ParameterTest {

	@Test
	public void param()
	{
		String URL = System.getProperty("url");
	    String BROWSER = System.getProperty("browser");
		String ENV = System.getProperty("Env");
		String USERNAME = System.getProperty("userName");
		String PASSWORD = System.getProperty("passWord");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(ENV);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}
}
