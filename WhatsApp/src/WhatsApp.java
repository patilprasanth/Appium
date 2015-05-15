import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;


public class WhatsApp 
{
	AndroidDriver driver;
	
	@Test
	public void open() throws MalformedURLException
	{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "ASUS_T00J" );
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion","4.4.2");
		File file = new File("F:\\workspace\\WhatsApp\\Apk\\com.flipkart.android.apk");
		cap.setCapability("app", file.getAbsolutePath());
		driver = new AndroidDriver(new URL("http://192.168.2.6:4723/wd/hub"), cap);
		driver.findElement(By.className("android.widget.LinearLayout")).click();
	}

}
