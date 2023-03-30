import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.security.auth.login.LoginContext;

public class LoginTest extends BaseTest{

    ChromeDriver driver;

    LoginPage loginPage;

    @BeforeMethod
    public void SetUp(){
    driver=openBrowser();
    loginPage=new LoginPage(driver);
    }
    @Test
    public void LoginonPage(){
        loginPage.Login("Admin","admin123");
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
    }
    @Test
    public void LoginonPageWithNoValidData() {
        loginPage.Login("Admin", "admin");
        Assert.assertEquals(loginPage.eror(), "Invalid credentials");
    }
    @AfterMethod
    public void After(){
        driver.quit();
    }




}
