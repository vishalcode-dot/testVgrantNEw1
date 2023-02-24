package testVagrantTest;

import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
import org.testng.annotations.Test;

import IMDB_Pom.imbd;

public class testCases extends utility{
	
	


	@Test()
	public void imdbandwikitest()
	{
		imbd obj =new imbd(driver);
		obj.IMDBandWikiMethod();
	}

}
