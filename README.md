# DemoAutomation

## Overview
This project is an automated UI test script using Selenium WebDriver with Java. It automates the login, item selection, checkout, and order completion process on the SauceDemo website.

## Prerequisites
Ensure you have the following installed before running the script:
- Java (JDK 8 or later)
- Maven (Optional, if using Maven for dependency management)
- Chrome browser
- ChromeDriver (Ensure the version matches your installed Chrome browser)
- Selenium WebDriver

## Installation and Setup

1. Clone this repository:
   ```sh
   git clone https://github.com/your-username/DemoAutomation.git
   cd DemoAutomation
   ```

2. Download and install the correct version of [ChromeDriver](https://chromedriver.chromium.org/downloads).
   - Place the ChromeDriver executable in your system's PATH or specify its location in the script.

3. Add Selenium dependencies to your project (if using Maven, add to `pom.xml`):
   ```xml
   <dependencies>
       <dependency>
           <groupId>org.seleniumhq.selenium</groupId>
           <artifactId>selenium-java</artifactId>
           <version>4.5.0</version>
       </dependency>
   </dependencies>
   ```

4. Compile and run the script:
   ```sh
   javac -cp ".;selenium-java-4.5.0.jar" ui/DemoAutomation.java
   java -cp ".;selenium-java-4.5.0.jar" ui.DemoAutomation
   ```

## Test Execution Steps
The script automates the following actions:
1. Opens Chrome and navigates to [SauceDemo](https://www.saucedemo.com/)
2. Logs in using a predefined username and password
3. Adds a "Sauce Labs Bolt T-Shirt" to the shopping cart
4. Proceeds to checkout
5. Fills in the checkout details
6. Completes the order and finishes the test
7. Closes the browser

## Output
- Console logs showing each step execution
- Start and end timestamps of the test run

## Notes
- Modify the script if needed to use different test data.
- Ensure ChromeDriver is updated to match your Chrome version.
- You can enhance this script by adding assertion checks for verification.

## License
This project is open-source and available under the MIT License.

