package ex_28_ENUM;

public enum APIRealLifeURLs {
    vwo("https://app.vwo.com"),
    katalon("https://katalon.com"),
    google("https://google.com");

    private String url;

    public String getUrl() {
        return url;
    }

    APIRealLifeURLs(String url) {
        this.url = url;
    }
}
