package ui;

import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomation {

    public static void main(String[] args) throws IOException, InterruptedException {
        // Record the start time of the test
        Date currentDate = new Date();
        System.out.println("Test started at: " + currentDate);

        ChromeDriver driver = new ChromeDriver(); // for chrome browser and creating the object of the driver
        System.out.println("Opened Chrome browser and navigating to the website...");
        
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        System.out.println("Navigated to https://www.saucedemo.com/ and maximized the window.");

        // Log in to the website
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        System.out.println("Entered username: standard_user");
        
        Thread.sleep(1000);
        
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        System.out.println("Entered password: secret_sauce");
        
        Thread.sleep(1000);
        
        driver.findElement(By.id("login-button")).click();
        System.out.println("Clicked on login button.");
        
        Thread.sleep(1000);
        
        // Adding item to cart
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        System.out.println("Added Sauce Labs Bolt T-Shirt to the cart.");
        
        Thread.sleep(1000);
        
        // Navigating to the shopping cart
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        System.out.println("Navigated to the shopping cart.");
        
        Thread.sleep(1000);
        
        // Proceed to checkout
        driver.findElement(By.id("checkout")).click();
        System.out.println("Clicked on checkout button.");
        
        Thread.sleep(1000);
        
        // Filling in the checkout form
        driver.findElement(By.id("first-name")).sendKeys("Test");
        System.out.println("Entered first name: Test");
        
        Thread.sleep(1000);
        
        driver.findElement(By.id("last-name")).sendKeys("User");
        System.out.println("Entered last name: User");
        
        Thread.sleep(1000);
        
        driver.findElement(By.id("postal-code")).sendKeys("12345");
        System.out.println("Entered postal code: 12345");
        
        Thread.sleep(1000);
        
        // Continuing to the next step
        driver.findElement(By.id("continue")).click();
        System.out.println("Clicked on continue button.");
        
        Thread.sleep(1000);
        
        // Finalizing the order
        driver.findElement(By.id("finish")).click();
        System.out.println("Clicked on finish button. Order completed.");
        
        // End of the test
        System.out.println("Test completed successfully.");

        // Record the end time
        Date endDate = new Date();
        System.out.println("Test ended at: " + endDate);

        // Close the driver
        driver.quit();
    }
}
