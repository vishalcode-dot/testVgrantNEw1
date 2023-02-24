package IMDB_Pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;





public class imbd {
	
	WebDriver driver; 
	public String imdbUrl = "https://www.imdb.com/title/tt9389998/";
    public String wikiUrl = "https://en.wikipedia.org/wiki/Pushpa:_The_Rise";
	
	@FindBy(css ="li[data-testid='title-details-releasedate'] div a[role='button']")
	private WebElement imdbreleaseDate;
	
    @FindBy(css = "li[data-testid='title-details-origin'] a[role='button']")
    private WebElement imdbcountry;
    
    @FindBy(xpath="//tbody/tr[12]/td[1]/div[1]/ul[1]/li[1]")
	private WebElement wikireleaseDate;
	
    @FindBy(xpath = "//td[@class='infobox-data' and text()='India']")
    private WebElement wikicountry;
    
  //td[normalize-space()='India']

	public imbd(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void IMDBandWikiMethod()
	{
		
		driver.get(imdbUrl);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView(true);",imdbreleaseDate );
		 
		 String imdbReleaseDate = imdbreleaseDate.getText().trim();
		 System.out.println(imdbReleaseDate);
		 
		 String imdbCountry = imdbcountry.getText().trim();
		 System.out.println(imdbCountry);

		 
		 driver.get(wikiUrl);
		 String wikiReleaseDate =wikireleaseDate.getText().trim();
		 System.out.println(wikiReleaseDate);

		 String wikiCountry =wikicountry.getText().trim();
		 System.out.println(wikiCountry);
		 Assert.assertEquals(imdbCountry, wikiCountry);
		 Assert.assertEquals(imdbReleaseDate, wikiReleaseDate);
		 //Assert.assertEquals(imdbCountry, wikiCountry);
       
        
           
	}
	
	
	
	
	

}
