package hodito.Enum;

public enum SzemelyisegEnum {
    KERESKEDO("Kereskedő"),
    TOLVAJ("Tolvaj"),
    VARAZSLO("Varázsló"),
    HARCOS("Harcos"),
    TABORNOK("Tábornok"),
    VANDOR("Vándor"),
    GAZDALKODO("Gazdálkodó"),
    TUDOS("Tudós"),
    TULELO("Túlélő"),
    KARAVANMESTER("Karavánmester"),
    EPITES("Építés"),
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
