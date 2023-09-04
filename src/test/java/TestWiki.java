import ConfigurationWebDriver.BaseClass;
import data.Language;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import static exam.DATA.*;

@RunWith(Parameterized.class)
public class TestWiki extends BaseClass {

    Language language;

    @Parameterized.Parameters
    public static Collection options() {
        return Arrays.asList(Language.values());
    }

    public TestWiki(Language language) {
        this.language = language;
        if(!driver.getCurrentUrl().contains("https://"+language.getLang()+".wikipedia.org"))  {
            driver.get("https://"+language.getLang()+".wikipedia.org");
            System.out.println(i++);
        }

    }

    @Test
    public void test(){
        System.out.println(driver.getTitle());

    }
    @Test
    public void test2(){
        System.out.println(driver.getCurrentUrl());
    }

}