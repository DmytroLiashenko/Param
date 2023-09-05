package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlowersPages {
    @FindBy(xpath=("//li[contains(@class,\"nav-item active\")]"))
    WebElement tab1;
    @FindBy(linkText="Доставка та оплата")
    WebElement tab2;
    @FindBy(linkText="Гарантії якості")
    WebElement tab3;

    public String tab1Test( ){
        return tab1.findElement(By.tagName("span")).getText();
    }
    public String tab2Test( ){
        return tab2.findElement(By.tagName("span")).getText();
    }
    public String tab3Test(){
        return tab3.findElement(By.tagName("span")).getText();
    }
}