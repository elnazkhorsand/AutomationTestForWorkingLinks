package test;

import java.util.List;
import java.util.Scanner;

public class RunTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/elnaz/Downloads/chromedriver");
        boolean testResult;

        System.out.println("Please enter your website's URL:");
        String url = new Scanner(System.in).nextLine();

        List<TestLinkContainer> testLinkContainerList = TestLinkMaker.makeTestLinkContainers();

        MakeLinksTest makeLinksTest = new MakeLinksTest(testLinkContainerList,url);
        testResult = makeLinksTest.doTest();

        if (testResult){
            System.out.println("Test is SUCSESSFUL.");
        }else System.out.println("Test is FAILED!!!! ");

    }
}
