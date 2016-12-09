package hodito.enums;

public enum BuildingCategory {

    BUILDING("building"), MANUFACTURE("manufacture");

    private String value;

    BuildingCategory(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
