package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestLinkMaker {

    public static List<TestLinkContainer> makeTestLinkContainers() {

        String link;
        String verification;
        Scanner scan = new Scanner(System.in);

        List<TestLinkContainer> linksContainer = new ArrayList<>();

        System.out.println("Enter your link(s) and verfication(s):");

        while (true) {
            System.out.println("Please enter your link: \n" +
                    "when you are done with the inputs please enter: \"end\"");
            link = scan.nextLine();
            if (link.equalsIgnoreCase("end"))
                break;

            System.out.println("Please enter your verification:");
            verification = scan.nextLine();

            linksContainer.add(new TestLinkContainer(link, verification));
        }
        return linksContainer;
    }

}
