package guviproject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class MyProgram {

	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\priya_workspace\\Project\\driver\\chromedriver.exe"); 	
		 driver = new ChromeDriver();
		driver.get("https://www.bestbuy.com/");
		
		driver.manage().window().maximize();
		WebElement element =  driver.findElement(By.xpath("//img[@alt='United States']"));
		element.click();
		
		
		driver.findElement(By.xpath("/html/body/div[4]/x`div[@class='_none']//nav[@class='bottom-nav']/ul[@class='bottom-nav-right']/li[1]/div/div[@class='_none']//div[@class='flyout-button-wrapper']/button[@type='button']/span[.='Account']")).click();
		
		
		
		
		driver.findElement(By.linkText("Sign In"));
		
		
		element.click();
		
		
		driver.findElement(By.xpath("/html//input[@id='fld-e']")).sendKeys("priyarampraveen@gmail.com");
		driver.findElement(By.xpath("/html//input[@id='fld-p1']")).sendKeys("Priya@1307");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
			
		
	
		
	}
	@Test
	public void test()
	
	{
		driver.findElement(By.linkText("Top Deals")).click();
		System.out.println( driver.getTitle());
		System.out.println( driver.getCurrentUrl());
		
		driver.findElement(By.linkText("Deal of the Day")).click();
		System.out.println( driver.getTitle());
		System.out.println( driver.getCurrentUrl());
		
		driver.findElement(By.linkText("Totaltech Membership")).click();
		System.out.println( driver.getTitle());
		System.out.println( driver.getCurrentUrl());
		
		driver.findElement(By.linkText("Credit Cards")).click();
		System.out.println( driver.getTitle());
		System.out.println( driver.getCurrentUrl());
		
		driver.findElement(By.cssSelector("[data-lid='hdr_gift_cards']")).click();
		System.out.println( driver.getTitle());
		System.out.println( driver.getCurrentUrl());
		
		driver.findElement(By.linkText("Gift Ideas")).click();
		System.out.println( driver.getTitle());
		System.out.println( driver.getCurrentUrl());
		
		driver.findElement(By.linkText("Health & Wellness")).click();
		System.out.println( driver.getTitle());
		System.out.println( driver.getCurrentUrl());
		
		//button[@type='button']/span[.='More']
				driver.findElement(By.xpath("/html/body/div[3]/div[@class='_none']//nav[@class='bottom-nav']//div[@class='flyout-button-wrapper utility-nav-drawer utility-nav-more-drawer']/button[@type='button']/span[.='More']")).click();
				
		System.out.println( driver.getTitle());
		System.out.println( driver.getCurrentUrl());
		
		driver.findElement(By.cssSelector(".utility-nav-drawer-flyout-list [data-lid='hdr_best_buy_outlet']")).click();
		
		System.out.println( driver.getTitle());
		System.out.println( driver.getCurrentUrl());
		
		driver.findElement(By.cssSelector(".utility-nav-drawer-flyout-list [data-lid='hdr_best_buy_business']")).click();
		
		System.out.println( driver.getTitle());
		System.out.println( driver.getCurrentUrl());
	}
	@Test
	public void brokenURL()
	{
		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("No of links are = " + links.size());


		for (int i = 0; i < links.size(); i++) {

			WebElement E1 = links.get(i);

			String url = E1.getAttribute("href");

			verifyLinks(url);

		}


		driver.quit();

	}


	public static void verifyLinks(String linkUrl) {


		try {

			URL link = new URL(linkUrl);

			HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();

			httpConn.setConnectTimeout(5000);

			httpConn.connect();


			if (httpConn.getResponseCode() >= 404) {

				System.out.println(linkUrl + " - " + httpConn.getResponseMessage() + " is broken link");

			} else {

				System.out.println(linkUrl + " - " + httpConn.getResponseMessage());

			}

		}


		catch (Exception e) {


		}

	}
	@Test
	public void addToCartCheck()
	{
		driver.findElement(By.linkText("Top Deals")).click();
		driver.findElement(By.cssSelector(".cn-current-page .cn-item-copy")).click();
		driver.findElement(By.linkText("Desktops")).click();
		driver.findElement(By.xpath("/html//div[@id='site-control-content']/div[@class='widget-container']/div[@class='container']/div[14]/div[@class='col-xs-12']/div/div[@class='col-xs-12']/div//div[@class='wf-content']/div[2]/div[2]//div[@class='wf-offer-image']/a[@href='/site/apple-27-imac-with-retina-5k-display-latest-model-intel-core-i7-3-8ghz-8gb-memory-512gb-ssd-silver/6200723.p?skuId=6200723']")).click();
		
		driver.findElement(By.xpath("/html//div[@id='site-control-content']/div[@class='widget-container']/div[@class='container']/div[14]/div[@class='col-xs-12']/div/div/div//div[@class='wf-content']/div[2]/div[2]//div[@class='wf-offer-price-block']//div[@class='wf-embedded-a2c']/div/div[@class='_none']//button[@type='button']")).click();
		
		driver.findElement(By.xpath("//body/div[@class='c-portal']/div[@role='dialog']/div[1]/div/div[@role='document']//a[@role='button']")).click();
		
		driver.findElement(By.cssSelector(".checkout-buttons__checkout [type]")).click();
		
		
	}
	@Test
	public void shopByDepartment()
	{
		WebDriverManager.chromedriver().setup();
		 	
		 driver = new ChromeDriver();
		driver.get("https://www.bestbuy.com/");
		driver.findElement(By.xpath("/html//div[@id='cart-header']/div[@class='_none']//nav[@class='hamburger-menu']/button[@class='c-button-unstyled hamburger-menu-button']")).click();
		
		driver.findElement(By.cssSelector(".featured-section")).click();
		
		driver.findElement(By.xpath("//div[@id='cart-header']/div[@class='_none']//nav[@class='hamburger-menu']//div[@class='hamburger-menu-flyout-list-wrapper toast-arrow-up']/ul[@class='hamburger-menu-flyout-list']/li[1]/h2[@class='hamburger-menu-title']")).click();
		
		driver.findElement(By.xpath("/html//div[@id='cart-header']/div[@class='_none']//nav[@class='hamburger-menu']//div[@class='hamburger-menu-flyout-list-wrapper toast-arrow-up']/ul[@class='hamburger-menu-flyout-list']/li[2]/button[@type='button']")).click();
		
		driver.findElement(By.linkText("85-Inch or Larger TVs")).click();
		
		driver.findElement(By.cssSelector("img[alt^='Samsung - 75\" Class  Q70A Series QLED 4K UHD Smart Tizen TV ']")).click();
		
		driver.findElement(By.xpath("/html//div[@id='main-results']/ol[@class='sku-item-list']/li[2]/div/div/div[@class='_none']//div[@class='list-item lv']//div[@class='sli-add-to-cart']/div/div[@class='_none']//button[@type='button']")).click();
		
		
		
	}
	@Test
	public void selectAnyBrandcase()
	{
		WebDriverManager.chromedriver().setup();
	 	
		 driver = new ChromeDriver();
		driver.get("https://www.bestbuy.com/");
		driver.findElement(By.xpath("/html//div[@id='cart-header']/div[@class='_none']//nav[@class='hamburger-menu']/button[@class='c-button-unstyled hamburger-menu-button']")).click();
		
		driver.findElement(By.cssSelector(".hamburger-menu-flyout-list-wrapper li:nth-of-type(3) [type]")).click();
		
		driver.findElement(By.linkText("Apple")).click();
		
		
	}
	@Test
	public void checkOutPage()
	{
		WebDriverManager.chromedriver().setup();
	 	
		 driver = new ChromeDriver();
		driver.get("https://www.bestbuy.com/");
		driver.findElement(By.cssSelector(".cart-label")).click();
		driver.findElement(By.cssSelector(".checkout-buttons__checkout [type]")).click();
		driver.findElement(By.xpath("/html//div[@id='checkoutApp']/div[@class='page-spinner page-spinner--out']/div[1]/div[1]//section[@class='fulfillment-page-fu2021']//section[@class='fu2021-white-panel']//button/span[.='Continue to Payment Information']")).click();
		
		driver.findElement(By.xpath("//input[@id='number']")).sendKeys("1234098745679732");
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("priya");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Mano");
		driver.findElement(By.xpath("//input[@id='address-name']")).sendKeys("no.36 , Periyar Nagar , Chennai");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("chennai");
		driver.findElement(By.xpath("//select[@id='state']")).sendKeys("Tamil Nadu");
		driver.findElement(By.xpath("//input[@id='postalCode']")).sendKeys("600082");
		driver.findElement(By.cssSelector("[data-track='Place your Order - Contact Card']")).click();
		
		
		System.out.println(driver.getTitle() + "Order has been palced successfully");
	}
	
	
	@Test
	public void closeTestCase()
	{
		driver.close();
	}
	}
	
	
	

