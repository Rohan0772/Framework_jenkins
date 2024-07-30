package organisationtest;

import org.testng.annotations.Test;

public class CreateOrganisationTest {
	@Test
	public void org1_Test() throws Exception {
		System.out.println("SMOKE SUITE");
		String URL = System.getProperty("url","default url");
		String BROWSER = System.getProperty("browser","default browser");
		String USERNAME = System.getProperty("username", "default un");
		String PASSWORD = System.getProperty("password","default pw");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
	}

}
 