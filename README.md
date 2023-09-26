# selenium_web_automation

**Introduction**
This README provides a brief overview of using Selenium with Java for web automation. Selenium is a popular tool for automating web browsers and is widely used for testing purposes.

**Prerequisites**
Java: Ensure you have Java installed on your machine. Download and install the latest JDK (Java Development Kit) from the official Oracle website.

Selenium WebDriver: Download the Selenium WebDriver Java bindings from the Selenium website (https://www.selenium.dev/downloads/). Add the WebDriver JAR files to your Java project.

**Setting Up Your Project**
Create a New Java Project: Start by creating a new Java project in your preferred IDE (Eclipse, IntelliJ IDEA, etc.).

Import Selenium WebDriver Libraries: Add the Selenium WebDriver JAR files to your project's build path.

Set Up WebDriver: Depending on the browser you want to automate (e.g., Chrome, Firefox), download the respective WebDriver executable and configure it in your project.

Running the Code
Compile and run your Java program to execute the Selenium WebDriver script. Make sure the WebDriver executable path is correctly set.

**Sample code**:
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample {

    public static void main(String[] args) {
        // Set the path to the WebDriver executable (e.g., chromedriver)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://example.com");

        // Perform actions (e.g., click, type)
        // ...

        // Close the browser
        driver.quit();
    }
}

**pom.xml sample file**:

<project xmlns="http://maven.apache.org/POM/4.0.0" 
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 
                             http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    
    <groupId>com.example</groupId>
    <artifactId>selenium-bdd-testng</artifactId>
    <version>1.0.0</version>
    
    <dependencies>
        <!-- Selenium WebDriver -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>3.141.59</version> <!-- Update to the latest version -->
        </dependency>
        
        <!-- TestNG -->
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.4.0</version> <!-- Update to the latest version -->
        </dependency>
        
        <!-- Cucumber for BDD -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>6.11.0</version> <!-- Update to the latest version -->
        </dependency>
        
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-testng</artifactId>
            <version>6.11.0</version> <!-- Update to the latest version -->
        </dependency>
    </dependencies>
    
    <build>
        <plugins>
            <!-- Maven Compiler Plugin -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.8.0</version> <!-- Update to the latest version -->
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                </configuration>
            </plugin>
            
            <!-- Maven Surefire Plugin -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.0.0-M5</version> <!-- Update to the latest version -->
                <configuration>
                    <suiteXmlFiles>
                        <suiteXmlFile>testng.xml</suiteXmlFile>
                    </suiteXmlFiles>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>



