import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.SelectDocumentpage;
import static org.testng.Assert.assertEquals;

public class Test1 {

    String url="https://www.levelset.com/";
    String docname="Send a Warning";
    String docprice="$59";
    WebDriver driver;
    WebDriverManager driverManager;
    Homepage homepage;
    SelectDocumentpage selectDocumentpage;


    @BeforeTest
    public void setup(){
        driverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to(url);

    }
     @Test
    public void verifygetpaid(){
        homepage=new Homepage(driver);
        homepage.clickongetpaidbtn();
        selectDocumentpage=new SelectDocumentpage(driver);
         assertEquals(selectDocumentpage.getdocumentname(docname),docname,"the name of the document is not correct");
         assertEquals(selectDocumentpage.getpricevalue(docname),docprice,"the price of the document is not correct");


    }
    @AfterClass
    public void teardown(){

       driver.quit();
}


}
