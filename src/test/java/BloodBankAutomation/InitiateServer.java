package BloodBankAutomation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InitiateServer {
	AndroidDriver driver; 
	
	@BeforeClass
	public void stratTest() throws MalformedURLException {
		File f = new File("D://SubratWorkspace//"); 
		File fs = new File(f,"blood-point.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "SubratPhone2");
		cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		
//		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),cap);
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		AndroidDriver driver = new AndroidDriver(service,cap);
	}
	
	@AfterClass
	public void stopTest() {
		driver.quit();
	}

}
