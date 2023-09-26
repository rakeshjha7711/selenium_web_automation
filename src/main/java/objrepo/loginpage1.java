package objrepo;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage1
{
    WebDriver driver;

    By usename = By.id("");
    By password = By.id("");
    By loginbutton = By.id("");

    public loginpage1(WebDriver driver) {
    }

    Public demopage1 (WebDriver driver)
    {
        this.driver = driver;
        return null;
    }
    public void typeusername(String uid)
    {
      driver.findElement(usename).sendKeys(uid);
    }
    public void typepassword(String pass)
    {
      driver.findElement(password).sendKeys(pass);
    }
    public void clickloginbutton()
    {
        driver.findElement(loginbutton).click();
    }
}
