import ConfigurationWebDriver.BaseClass;
import data.BuferFlowers;
import data.Language;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;
import pages.FlowersPages;

import java.util.Arrays;
import java.util.Collection;
import java.util.ResourceBundle;

import static exam.DATA.i;

@RunWith(Parameterized.class)
public class TestFlowers extends BuferFlowers {

    Language language;

    @Parameterized.Parameters
    public static Collection options() {
        return Arrays.asList(Language.values());
    }

    public TestFlowers(Language language) {
        this.language = language;
        if(!driver.getCurrentUrl().contains("https://flowers.ua/" +language.getLang()))  {
            driver.get("https://flowers.ua/" +language.getLang());
            System.out.println(i++);
            flowersBundle= ResourceBundle.getBundle(language.getLang());
            flowersPages= PageFactory.initElements(driver, FlowersPages.class);
        }
    }
@Test
    public void testTab1(){
    Assert.assertEquals(flowersBundle.getString("tab1"),flowersPages.tab1Test());
}
    @Test
    public void testTab2(){
        Assert.assertEquals(flowersBundle.getString("tab2"),flowersPages.tab2Test());
    }
    @Test
    public void testTab3(){
        Assert.assertEquals(flowersBundle.getString("tab3"),flowersPages.tab3Test());
    }
}
