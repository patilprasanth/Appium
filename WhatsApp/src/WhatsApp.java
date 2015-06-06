import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Properties;

import javax.management.openmbean.TabularType;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;


public class WhatsApp 
{
	AndroidDriver driver;

	
	@Test
	public void AddingManualExpense() throws MalformedURLException
	{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "ASUS_T00ooooo" );
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion","4.4.2");
		File file = new File("F:\\Git Repo\\Appium\\WhatsApp\\Apk\\com.daamitt.walnut.app-64.apk");
		cap.setCapability("app", file.getAbsolutePath());
		driver = new AndroidDriver(new URL("http://192.168.2.2:4723/wd/hub"), cap);
		driver.findElement(By.id("com.daamitt.walnut.app:id/AddManualTxnFAB")).click();
		
		driver.findElement(By.id("com.daamitt.walnut.app:id/FMT1B")).click();
		driver.findElement(By.id("com.daamitt.walnut.app:id/FMT2B")).click();
		driver.findElement(By.id("com.daamitt.walnut.app:id/FMT3B")).click();
		driver.findElement(By.id("com.daamitt.walnut.app:id/FMT4B")).click();
		driver.findElement(By.id("com.daamitt.walnut.app:id/FMT5B")).click();

		driver.findElement(By.id("com.daamitt.walnut.app:id/FMTFood")).click();

		driver.findElement(By.id("com.daamitt.walnut.app:id/FMTDoneTV")).click();
		driver.findElement(By.id("com.daamitt.walnut.app:id/monthSpendTotal")).click();
		String spent_amt = driver.findElement(By.id("com.daamitt.walnut.app:id/STVAmount")).getText();
		String Amt = (String) spent_amt.subSequence(1,7);
		String[] finalAmt = Amt.split(",");
		Amt = finalAmt[0]+finalAmt[1];
//		Assert.assertEquals("12345", Amt);
		String Cat = driver.findElement(By.id("com.daamitt.walnut.app:id/ASTVCatName")).getText();
		Assert.assertEquals("Food & Drinks", Cat);
		spent_amt = driver.findElement(By.id("com.daamitt.walnut.app:id/ASTVAmount")).getText();
		Amt = (String) spent_amt.subSequence(1,7);
		finalAmt = Amt.split(",");
		System.out.println("mglkgfdlkmlkg");
		Amt = finalAmt[0]+finalAmt[1];
		Assert.assertEquals("12345w2ww2w2w", Amt);
		
		
	}

}
