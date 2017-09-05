import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.PnUaMain;
import utils.DriverFactory;

import java.util.concurrent.TimeUnit;

public class TestPnUa extends BaseOfPnUa {
    WebDriver driver;

    @BeforeMethod
    public void ssetupPage() throws Exception{
        this.pnUaMain = new PnUaMain(DriverFactory.getDriver());
    }

    @Test
    public void verifyServicesCategory() throws Exception {
        pnUaMain.openComputersCategory();
        DriverFactory.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println(driver.findElement(By.xpath(".//*[@class = 'column-wrapper'][4]/article[3]/div")).getText());
//        System.out.println(pnUaComputers.itServicesText());
//        Assert.assertEquals(pnUaComputers.itServicesText(), "IT услуги");
    }
}
