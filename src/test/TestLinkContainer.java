package test;

public class TestLinkContainer {

    private final String url;
    private final String urlVerification;

    public TestLinkContainer(String url, String urlVerification) {
        this.url = url;
        this.urlVerification = urlVerification;
    }

    public String getUrl() {
        return url;
    }

    public String getUrlVerification() {
        return urlVerification;
    }
}
