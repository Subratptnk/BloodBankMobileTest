package BloodBankAutomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class FirstPageTest extends InitiateServer {

	@Test
	public void loginTest() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement email = driver.findElement(AppiumBy.id("com.android.iunoob.bloodpoint:id/input_username"));
		WebElement password = driver.findElement(AppiumBy.id("com.android.iunoob.bloodpoint:id/input_password"));
		WebElement loginBtn = driver.findElement(AppiumBy.id("com.android.iunoob.bloodpoint:id/button_login"));
		
		email.sendKeys("testing1@gmail.com");
		password.sendKeys("Subrat@123");
		loginBtn.click();
		
	}
	@Test
	public void registrationTest() {
		WebElement registerBtn = driver.findElement(AppiumBy.id("com.android.iunoob.bloodpoint:id/button_register"));
		WebElement fistName = driver.findElement(AppiumBy.id("com.android.iunoob.bloodpoint:id/input_fullName"));
		WebElement email = driver.findElement(AppiumBy.id("com.android.iunoob.bloodpoint:id/input_userEmail"));
		WebElement password = driver.findElement(AppiumBy.id("com.android.iunoob.bloodpoint:id/input_password"));
		WebElement retyprPassword = driver.findElement(AppiumBy.id("com.android.iunoob.bloodpoint:id/input_password_confirm"));
		WebElement mobile = driver.findElement(AppiumBy.id("com.android.iunoob.bloodpoint:id/inputMobile"));
		WebElement address = driver.findElement(AppiumBy.id("com.android.iunoob.bloodpoint:id/inputAddress"));
		
		
		
	}
	@Test
	public void forgetPasswordTest() {
		
	}
}
