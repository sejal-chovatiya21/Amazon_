package basepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseAmazonclass {
          
	//browser info
	//url info
	//username and password
	
	public static Properties prop = new Properties();
	public static WebDriver driver;
	
	//step 1
	public BaseAmazonclass() {
		
		try {
			FileInputStream file = new 	FileInputStream("E:\\java program\\Amazon\\src\\test\\java\\Environmentvariables\\Config.properties");
		   prop.load(file);
		   }
		
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
        catch (IOException a) {
        	a.printStackTrace();
        	
        }
	}
		
		//step 2
		public static void initiation(){
			String browsername = prop.getProperty("browser");
			
			if(browsername.equals("Firefox")){
				System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
					
				driver = new FirefoxDriver();}
			else if (browsername.equals("ChromeDriver")) {
				System.setProperty("webdriver.chrome.driver","chrome.exe");
				driver = new ChromeDriver();
				
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			
			
			}
			
		public static void screenshots(String Filename) {
		File file=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
			FileUtils.copyFile(file, new File("E:\\java program\\Amazon\\src\\test\\java\\screenshots\\Screenshots"+Filename+"jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        
        
		}
	

	
	}
