package groupware;


import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * Date : 2018-07-23
 *
 */

public class attendance { 
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();
 
   
  @Before
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    

	  }

@Test
	public void p_001() throws Exception {
		driver.get("http://gw.sta.co.kr");
		driver.findElement(By.id("UserName")).click();
		driver.findElement(By.id("UserName")).clear();
		driver.findElement(By.id("UserName")).sendKeys("jsbae");
	    driver.findElement(By.id("Password")).click();
	    driver.findElement(By.id("Password")).clear();
	    driver.findElement(By.id("Password")).sendKeys("qofhd4107!");
	    driver.findElement(By.xpath("//*[@id=\"login_con\"]/div[3]/ul[2]/li[2]/a/img")).click();
	    System.out.println("Login success");
	  
	    if( driver.findElements(By.xpath("//*[@id=\"ltGoingHour\"]")).isEmpty()){
			driver.findElement(By.xpath("//*[@id=\\\"divLayoutContents\\\"]/div[2]/div/div[1]/div[1]/div[1]/div[3]/ul/li[1]")).click();
			System.out.println("출근찎음");}
		else{
			System.out.println("출근완료");}
}		  
		
  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

	public boolean existElement(WebDriver wd, By by, String meaning) {
		WebDriverWait wait = new WebDriverWait(wd, 2);
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(by));

		} catch (TimeoutException e) {

			return false;
		}
		return true;
	}
	 
}
