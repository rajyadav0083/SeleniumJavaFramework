package test.java.testscripts;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Login {

	/**
	 * @param args
	 * @return
	 * @throws InterruptedException
	 */
	@Test
	public void Test1(){
		EdgeDriver driver=new EdgeDriver();
		Logger log = LogManager.getLogger(Test_Login.class);
		try {
			// Github
			log.info("Test started");
			driver.navigate().to("https://www.toolsqa.com/");
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.className("navbar__tutorial-menu--text")).click();

			WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'QA Practices')]")));
			driver.findElement(By.xpath("//span[contains(text(),'QA Practices')]")).click();

			String text1= driver.findElement(By.xpath("//span[contains(text(),'QA Practices')]")).getText();
			log.info("Text get: "+ text1);
			Assert.assertTrue(text1.equals("QA Practices"), "Text not matched successfully");
			
			Thread.sleep(3000);
			//driver.findElement(By.xpath("/html/body/nav/div/div/div[2]/div/ul/li[3]/a']")).click();

			 //Alert alert= driver.switchTo().alert();
			 //alert.accept();
			 //System.out.println("Text::"+text);
			log.info("Test case executed successfully");

			driver.close();
		} catch (Exception e) {
			log.error("Exception@@@@@@@@@@@@"+e);
		}

	}

}
