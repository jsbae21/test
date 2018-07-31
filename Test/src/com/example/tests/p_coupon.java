package com.example.tests;


import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p_coupon { 
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
	driver.get("https://alpha-www.baeminfresh.com/");
    driver.findElement(By.linkText("로그인")).click();
    driver.findElement(By.id("member_id")).clear();
    driver.findElement(By.id("member_id")).sendKeys("sta_jsbae");
    driver.findElement(By.id("pwd")).clear();
    driver.findElement(By.id("pwd")).sendKeys("q1w2e3r4t5");
    driver.findElement(By.id("member_id")).clear();
    driver.findElement(By.id("member_id")).sendKeys("baelong3@naver.com");
    driver.findElement(By.id("member_id")).click();
    driver.findElement(By.id("member_id")).clear();
    driver.findElement(By.id("member_id")).sendKeys("baelong7@naver.com");
    driver.findElement(By.xpath("//div[@id='login']/div/form/fieldset/button")).click();
    driver.findElement(By.id("search_str")).click();
    driver.findElement(By.id("search_str")).clear();
    driver.findElement(By.id("search_str")).sendKeys("무나물");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.xpath("//ul[@id='products']/li/dl")).click();
    driver.findElement(By.xpath("//ul[@id='products']/li/dl/dt/a/span")).click();
    driver.findElement(By.xpath("//button[@type='button']")).click();
    driver.findElement(By.xpath("//div[@id='lnb']/ul/li[6]/a")).click();
    driver.findElement(By.id("btn_select_receipt_date")).click();
    driver.findElement(By.xpath("//div[2]/button")).click();
    driver.findElement(By.xpath("//*[@id=\"ordFrm\"]/table[1]/tbody/tr/td[8]/button")).click();
  
    
    boolean isExist = false;
	//팝업닫기
	isExist = existElement(driver, By.id("//*[@id=\"coupon-list-tbl\"]/tbody/tr/td"), "출근체크 안함");
    if (isExist) {
		driver.findElement(By.xpath("//*[@id=\"divLayoutContents\"]/div[2]/div/div[1]/div[1]/div[1]/div[3]/ul/li[1]")).click();
		System.out.println("출근찍음");
	} else {
		System.out.println("출근찍혔음");
	}
	System.out.println("출근완료");
	Thread.sleep(3000);
    
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

