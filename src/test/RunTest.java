package test;

import java.util.List;

public class RunTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/elnaz/Downloads/chromedriver");
        boolean testResult;

        List<TestLinkContainer> testLinkContainerList = TestLinkMaker.makeTestLinkContainers();


        MakeLinksTest makeLinksTest = new MakeLinksTest(testLinkContainerList);
        testResult = makeLinksTest.doTest();

        if (testResult){
            System.out.println("Test is SUCSESSFUL.");
        }else System.out.println("Test is FAILED!!!! ");

    }
}
