import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.annotation.AnnotationFormatError;

public class MyInfoTest extends BaseTest{
    ChromeDriver driver;
     LoginPage loginPage;
     LeftMenuPage leftMenuPage;
     MyInfoPage myInfoPage;
     @BeforeMethod
    public void Setup(){
         driver=openBrowser();
         loginPage=new LoginPage(driver);
         leftMenuPage=new LeftMenuPage(driver);
         myInfoPage=new MyInfoPage(driver);
     }
     @Test
    public void MyInfoTest ()throws InterruptedException{
         loginPage.LoginOnPage();
         Thread.sleep(2000);
         leftMenuPage.Meni();
         Thread.sleep(2000);
         myInfoPage.EnterName("Dejan");
         Thread.sleep(2000);
         myInfoPage.DateInput("1989-11-23");
         Thread.sleep(2000);
         myInfoPage.SaveButton.click();
     }
     @AfterMethod
    public void After(){
         driver.quit();
     }
}
