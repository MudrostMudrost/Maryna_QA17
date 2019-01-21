import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class OpenChromeBrowser {
    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd=new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        }

        @Test
    public void chromeBrowserTest(){
        wd.get("http://google.com");
        wd.findElement(By.name("q")).click();
        
        }

        @AfterClass
    public void tearDown() throws InterruptedException {
        sleep(3000);
        wd.quit();
        }
}
