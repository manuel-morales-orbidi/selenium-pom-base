package testScript;

import baseClass.BaseClass;
import org.testng.annotations.Test;
import pages.DemoPage;

public class DemoTest extends BaseClass {
    @Test
    public void demoTestUno()throws Exception{
        DemoPage dm = new DemoPage(driver);
        System.out.println("Arrancamos Test....");

        Thread.sleep(1000);
        dm.searchBox("facebook");
        Thread.sleep(2000);
    }

}
