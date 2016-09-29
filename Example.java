package Success;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Amazon {
	

@Test
	public void signin() throws InterruptedException{
		
		WebDriver Wd = new FirefoxDriver();
		Wd.get("https://www.amazon.com/");

		
    Wd.findElement(By.id("twotabsearchtextbox")).sendKeys("flip flops");
    
    Wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    String str= Wd.findElement(By.id("s-result-count")).getText();
	
	String[] parts = str.split(" ");
		
	for(int i=0;i<5;i++)
	{
		System.out.println(parts[i]);
	}
	
	System.out.println("Results found="+parts[2]);
	
	}
  }	
