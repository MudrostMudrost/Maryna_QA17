import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstHomeWork {
    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd=new ChromeDriver();
    }
    @Test
    public void WikiTest(){
        wd.get().to(" http://wikipedia.org");
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
       Thread.sleep(300);
        wd.quit();
    }

}
