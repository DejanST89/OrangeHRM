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
    public void MyInfoTest (){
         loginPage.Login("Admin","admin123");
         leftMenuPage.Meni();
         myInfoPage.EnterName("Dejan");
         myInfoPage.DateInput("1989-11-23");
         myInfoPage.Save
     }
     @AfterMethod
    public void After(){
         driver.quit();
     }
}
