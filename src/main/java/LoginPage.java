import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
    @FindBy(name = "username")
    WebElement userName;

    @FindBy(name = "password")
    WebElement pass;

    @FindBy(css = ".orangehrm-login-button")
    WebElement loginButton;

    @FindBy(css=".oxd-alert-content-text")
    WebElement ErorMessage;

    public LoginPage(ChromeDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public String eror(){
        return ErorMessage.getText();
    }
    public void Login(String name,String passw){
        userName.sendKeys(name);
        pass.sendKeys(passw);
        loginButton.submit();
    }

}
