# testVgrantNEw1
README file for IMDB and Wiki Pushpa The Rise release date and country comparison Selenium TestNG Java code

Overview: This is a Selenium TestNG Java code designed to collect release date and country information for the movie Pushpa The Rise from two different websites - IMDB and Wikipedia. The code compares the release dates and countries of the movie on both websites and generates a report of the comparison.

Prerequisites:

Java Development Kit (JDK) Eclipse or any other Java IDE Selenium WebDriver Java bindings TestNG Java library ChromeDriver or any other WebDriver executable for the browser you intend to use Instructions:

Open Eclipse or your Java IDE of choice. Create a new maven project and given it testVagrant22 name Create a new POM package within the Sr/main java. in that use 2findby Annotation and locate the element with xpath or css for given url : public String imdbUrl = "https://www.imdb.com/title/tt9389998/"; public String wikiUrl = "https://en.wikipedia.org/wiki/Pushpa:_The_Rise"; Create a CONSTRUCTOR FOR pom class use pagefactory.initelements

then write code in method IMDBandwikimethod use Javaexcecuter use scolltoview method to locate element

Also add Assertion assert.equals to compare actual and expected result

Create utilityClass to setup browser adn tear down browser write a TestClass and exteds utility class then use testng annotation and call the method by creating object of pom class



then coverting the project toteng to create tesng.xml file and run the suite the test case fail because release date do not match
