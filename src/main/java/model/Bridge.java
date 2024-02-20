package model;

public enum Bridge {

    EMPTY("     "),
    FILL("-----"),
    COLUMN("|"),
    ;

    private final String value;

    Bridge(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
