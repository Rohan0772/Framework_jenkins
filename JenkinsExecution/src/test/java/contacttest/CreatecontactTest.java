package contacttest;

import org.testng.annotations.Test;

public class CreatecontactTest {
	@Test
	public void con_1Test() throws Exception {
		
		System.out.println("--Full regression--");
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
