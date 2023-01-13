package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TrelloTask {

	@SuppressWarnings("deprecation")
	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://trello.com/en/login");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); //wait for 60 seconds as it takes time to locate password element
		
		WebElement loginWithGoogle = driver.findElement(By.id("googleButton"));
		loginWithGoogle.click();
		
		WebElement emailId = driver.findElement(By.id("identifierId"));
		emailId.sendKeys("saisidharth62@gmail.com");
		
		WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button"));
		nextButton.click();
		
		WebElement passWord = driver.findElement(By.name("password"));
		passWord.sendKeys("Saisidharth31#");
		
		WebElement next = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button"));
		next.click();
		
		WebElement createNewBoard = driver.findElement(By.xpath("//span[.='Create new board']"));
		createNewBoard.click();
		
		WebElement createBoardName = driver.findElement(By.xpath("//div[contains(text(),'Board title')]/following::input[1]"));
		createBoardName.sendKeys("csk");
		
		WebElement buttonCreateBoard = driver.findElement(By.xpath("//button[text()=\'Create\']"));
		buttonCreateBoard.click();
		
		WebElement listTitleInput = driver.findElement(By.name("name"));
		listTitleInput.sendKeys("List A");
		
		WebElement addList = driver.findElement(By.xpath("//*[@id=\"board\"]/div/form/div/input"));
		addList.click();
		
		WebElement addCard = driver.findElement(By.xpath("//span[text() = \"Add a card\"]"));
		addCard.click();
		
		WebElement titleCard = driver.findElement(By.xpath("//*[@id=\"board\"]/div[1]/div/div[2]/div/div[1]/div/textarea"));
		titleCard.sendKeys("MSD");
		
		WebElement addtitleCard = driver.findElement(By.xpath("//*[@id=\"board\"]/div[1]/div/div[2]/div/div[2]/div[1]/input"));
		addtitleCard.click();
		
		WebElement addListB = driver.findElement(By.xpath("//input[@placeholder='Enter list title…']"));
		addListB.sendKeys("ListB");
		
		WebElement addListBCard = driver.findElement(By.xpath("//*[@id=\"board\"]/div[2]/form/div/input"));
		addListBCard.click();
		
		WebElement addCardinListB = driver.findElement(By.xpath("//a[@class='open-card-composer js-open-card-composer']"));
		addCardinListB.click();
		
		WebElement titleCardB = driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']"));
		titleCardB.sendKeys("Raina");
		
		WebElement addListBTitleCard = driver.findElement(By.xpath("//input[@value='Add card']"));
		addListBTitleCard.click();
		
		WebElement From = driver.findElement(By.xpath("//*[@id=\"board\"]/div[1]/div/div[2]/a"));
		WebElement To = driver.findElement(By.xpath("//*[@id=\"board\"]/div[2]/div"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(From, To).build().perform();
		
		WebElement getPositionButton = driver.findElement(By.xpath("//*[@id=\"board\"]/div[2]/div/div[2]/a[2]/div[3]"));
		Point xypoint = getPositionButton.getLocation();
		int xval = xypoint.getX();
		int yval = xypoint.getY();
		
		System.out.println("x value is " +xval+ "Y value is: "+ yval);
		
		
		WebElement openMenu = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div[5]/button"));
		openMenu.click();
		
		WebElement logout = driver.findElement(By.xpath("/html/body/div[3]/div/section/div/div/div/ul[3]/li[2]/button/span"));
		logout.click();
		
		WebElement accountLogout = driver.findElement(By.id("logout-submit"));
		accountLogout.click();
	}
			
}
