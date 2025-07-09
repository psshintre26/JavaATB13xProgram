package ex_28_ENUM;

public enum Colors {
    //colors with hex values
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String hexcode;

    Colors(String hexcode) {
        this.hexcode = hexcode;
    }

    public String getHexcode() {
        return hexcode;
    }
}
