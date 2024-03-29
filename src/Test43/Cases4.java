package Test43;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cases4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\aparnaod\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

		By uName = By.id("user-name");
		driver.findElement(uName).sendKeys("standard_user");

		By pWord = By.id("password");
		driver.findElement(pWord).sendKeys("secret_sauce");

		By loginBtn = By.id("login-button");
		driver.findElement(loginBtn).click();

		Thread.sleep(2000);

		By productsTitle = By.className("title");
		String actText = driver.findElement(productsTitle).getText();
		System.out.println(actText + " Expected Title ");

		By addCart = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
		driver.findElement(addCart).click();

		By addCart1 = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
		driver.findElement(addCart1).click();

		By addCart2 = By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
		driver.findElement(addCart2).click();

		By addCart3 = By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']");
		driver.findElement(addCart3).click();
		
		Thread.sleep(3000);

		By navigateCart = By.xpath("//a[@class ='shopping_cart_link']");
		driver.findElement(navigateCart).click();

		Thread.sleep(1000);

		By checkOut = By.xpath("//button[contains(@class, 'checkout_button')]");
		driver.findElement(checkOut).click();

		Thread.sleep(1000);

		By firstName = By.xpath("//input[starts-with(@placeholder,'First Name')]");
		driver.findElement(firstName).sendKeys("Aparna");

		Thread.sleep(1000);

		By sName = By.xpath("//input[@id='last-name']");
		driver.findElement(sName).sendKeys("Dsouza");

		Thread.sleep(1000);

		By postalCode = By.xpath("//input[@name = 'postalCode' and @id = 'postal-code']");
		driver.findElement(postalCode).sendKeys("626132");

		Thread.sleep(1000);

		By Continue = By.xpath("//input[@name = 'continue' or @id = 'continue']");
		driver.findElement(Continue).click();
		
		Thread.sleep(4000);

		By finalOrder = By.xpath("//a[contains(@id,'item_4_title_link')]");
		String finalScr = driver.findElement(finalOrder).getText();
		System.out.println(finalScr + " Expected Title ");
		
		Thread.sleep(1000);

		By finalOrder1 = By.xpath("//div[text() = 'Payment Information']");
		String finalScr1 = driver.findElement(finalOrder1).getText();
		System.out.println(finalScr1 + " Expected Title ");
		
		Thread.sleep(1000);

		By finalOrder2 = By.xpath("//div[text() = 'Shipping Information']");
		String finalScr2 = driver.findElement(finalOrder2).getText();
		System.out.println(finalScr2 + " Expected Title ");
		
		Thread.sleep(1000);

		By finalOrder3 = By.xpath("//div[text() = 'Price Total']");
		String finalScr3 = driver.findElement(finalOrder3).getText();
		System.out.println(finalScr3 + " Expected Title ");
		
		Thread.sleep(1000);

		By Finish = By.xpath("//button[@id = 'finish']");
		driver.findElement(Finish).click();
		
		Thread.sleep(1000);

		By SuccessScreen = By.xpath("//h2[text()='Thank you for your order!']");
		String sucScreen = driver.findElement(SuccessScreen).getText();
		System.out.println("\033[1m" + sucScreen + " (Order initiated successfully) ");

		Thread.sleep(3000);

		By b2h = By.xpath("//button[@name= 'back-to-products']");
		driver.findElement(b2h).click();

		Thread.sleep(3000);

		driver.quit();

	}

}