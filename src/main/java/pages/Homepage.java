package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Homepage {
     WebDriver driver;

      Actions actions;
     By getpaidbtn=By.xpath("//a[contains(@class,\"mob-dropdown-btn\")]");
    public Homepage(WebDriver driver){

        this.driver=driver;
        actions = new Actions(driver);

    }


    private WebElement locategetpaidbtn(){

        return driver.findElement(getpaidbtn);

    }

      public void clickongetpaidbtn(){
          actions.moveToElement(locategetpaidbtn());
          actions.click().build().perform();


}
}
