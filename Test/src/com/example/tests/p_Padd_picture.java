package com.example.tests;


import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class p_Padd_picture { 
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
    driver.findElement(By.id("member_id")).clear();
    driver.findElement(By.id("member_id")).sendKeys("baelong7@naver.com");
    driver.findElement(By.xpath("//div[@id='login']/div/form/fieldset/button/span")).click();
    driver.findElement(By.id("search_str")).click();
    driver.findElement(By.id("search_str")).clear();
    driver.findElement(By.id("search_str")).sendKeys("무나물");
    driver.findElement(By.name("form_search")).submit();
    driver.findElement(By.xpath("//ul[@id='products']/li/dl/dt/a/span")).click();
    driver.findElement(By.linkText("상품 후기 작성")).click();
    driver.findElement(By.xpath("//div[@id='foobar']/div/div/div/div/span[5]")).click();
    driver.findElement(By.xpath("//div[@id='foobar']/div/div/div[2]/dl/div/dd[2]/label")).click();
    driver.findElement(By.xpath("//div[@id='foobar']/div/div/div[2]/dl/div[2]/dd[2]/label")).click();
    driver.findElement(By.xpath("//div[@id='foobar']/div/div/div[2]/dl/div[3]/dd[2]/label")).click();
    driver.findElement(By.xpath("//div[@id='foobar']/div/div/div[3]/div/div/textarea")).click();
    driver.findElement(By.xpath("//div[@id='foobar']/div/div/div[3]/div/div/textarea")).clear();
    driver.findElement(By.xpath("//div[@id='foobar']/div/div/div[3]/div/div/textarea")).sendKeys("ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ");
    driver.findElement(By.xpath("//div[@id='foobar']/div/div/div[4]/div/div/div/div")).click();
    driver.findElement(By.xpath("//input[@type='file']")).clear();
    driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\fakepath\\제목 없음.png");
    driver.findElement(By.id("submitBtn")).click();
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

