import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class SimpleTest {
    @Test(groups = "chrome")
    public void test1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
    }

    @Test(groups = "firefox")
    public void firefox() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
    }

    @Test
    public void edge() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
    }

    @Test
    public void safari() {
        WebDriver driver = new SafariDriver();
    }
}
