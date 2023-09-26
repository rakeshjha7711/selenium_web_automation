package objrepo;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage
{
    WebDriver driver;

    By usename = By.id("");
    By password = By.id("");
    By loginbutton = By.id("");

    public loginpage(WebDriver driver) {
    }

    Public demopage (WebDriver driver)
    {
        this.driver = driver;
        return null;
    }
    public void typeusername()
    {
      driver.findElement(usename).sendKeys("rakesh");
    }
    public void typepassword()
    {
      driver.findElement(password).sendKeys("pass");
    }
    public void clickloginbutton()
    {
        driver.findElement(loginbutton).click();
    }
}
