package model;
public enum Category {
    ECONOMY("Economy"),
    BUSINESS("Business"),
    FIRST("First");

    private final String value;

    private Category(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
