package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SelectDocumentpage {
 WebDriver driver;
 WebDriverWait wait;

  public SelectDocumentpage(WebDriver driver){
      this.driver=driver;
  }
private WebElement locatedocumentname(String docname){
    wait=new WebDriverWait(driver, Duration.ofSeconds(30));
    By documentnamelocator=By.xpath("//div[contains(text(),\""+docname+"\")]");

    wait.until(ExpectedConditions.presenceOfElementLocated(documentnamelocator));
      return driver.findElement(documentnamelocator);
}
public String getdocumentname(String docname){

    return locatedocumentname(docname).getText();


}
    private WebElement locatedocumentprice(String docname){
        By documentpricelocator=By.xpath("//div[contains(text(),\""+docname+"\")]//parent::div[contains(@class,\"left-right-pair\")]//span[@class=\"price-amount\"]");

        return driver.findElement(documentpricelocator);
    }

  public String getpricevalue(String docname){
      return locatedocumentprice(docname).getText();

  }

}
