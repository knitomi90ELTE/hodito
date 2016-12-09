package hodito.enums;

public enum SzemelyisegEnum {
    KERESKEDO("Kereskedõ"),
    TOLVAJ("Tolvaj"),
    VARAZSLO("Varázsló"),
    HARCOS("Harcos"),
    TABORNOK("Tábornok"),
    VANDOR("Vándor"),
    GAZDALKODO("Gazdálkodó"),
    TUDOS("Tudós"),
    TULELO("Túlélõ"),
    KARAVANMESTER("Karavánmester"),
    EPITESZ("Építész"),
    STRATEGA("Stratéga"),
    KUFAR("Kufár");

    private String value;

    SzemelyisegEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
} 