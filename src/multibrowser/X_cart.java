package multibrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class X_cart {
    static String baseurl = "https://www.x-cart.com/";
    static WebDriver driver;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the Browser : ");
        String browser = scan.nextLine();

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "driver/IEDriverServer.exe");
            driver = new InternetExplorerDriver();

        } else if (browser.equalsIgnoreCase("microsoft edge")) {
            System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
            driver = new EdgeDriver();

        } else {
            System.out.println("Invalid Browser Name ");
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseurl);
        String title = driver.getTitle();
        System.out.println("Title :" + title);
        System.out.println("Length of title :" + title.length());
        driver.close();
    }

}
