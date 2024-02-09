package testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Test_Login2 {

	/**
	 * @param args
	 * @return 
	 * @throws InterruptedException
	 */
	@Test
	public void Test2(){
		EdgeDriver driver=new EdgeDriver();
		try {
			driver.navigate().to("https://www.toolsqa.com/");
			driver.manage().window().maximize();
			
			Thread.sleep(1000);
			
			driver.findElement(By.className("navbar__tutorial-menu--text")).click();
			Thread.sleep(1000);
			//driver.findElement(By.xpath("//span[contains(text(),'QA Practices')]")).click();
			//Thread.sleep(3000);
			//driver.findElement(By.xpath("/html/body/nav/div/div/div[2]/div/ul/li[3]/a']")).click();
			
			 //Alert alert= driver.switchTo().alert(); 
			 //alert.accept();
			 //System.out.println("Text::"+text);
			 
			driver.close();	
		} catch (Exception e) {
			System.out.println("Exception"+e);
		}

	}

}
