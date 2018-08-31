package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class MakeLinksTest{

    private final String url;
    private List<TestLinkContainer> testLinkContainerList;

    public MakeLinksTest(List<TestLinkContainer> testLinkContainerList, String url) {
        this.testLinkContainerList = testLinkContainerList;
        this.url = url;
    }

    public boolean doTest() {
        try {

            WebDriver webDriver = new ChromeDriver();
            webDriver.get(url);

            WebDriverWait webDriverWait = new WebDriverWait(webDriver,3);

            String textLink;
            String target;
            WebElement linkElement;
            String currentUrl;

            for (int i=0; i< testLinkContainerList.size();i++) {
                textLink = testLinkContainerList.get(i).getUrl();
                target = testLinkContainerList.get(i).getUrlVerification();
                linkElement = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(textLink)));

                linkElement.click();
                currentUrl = webDriver.getCurrentUrl().toString();

                if ( currentUrl.equals(target)){
                    webDriver.navigate().back();
                }
                else {
                    System.out.println("This link: "+"\""+target+"\""+" does not match");
                    webDriver.close();
                    return false;
                }


            }
            webDriver.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
