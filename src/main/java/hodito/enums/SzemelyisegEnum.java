package hodito.enums;

public enum SzemelyisegEnum {
    KERESKEDO("Keresked�"),
    TOLVAJ("Tolvaj"),
    VARAZSLO("Var�zsl�"),
    HARCOS("Harcos"),
    TABORNOK("T�bornok"),
    VANDOR("V�ndor"),
    GAZDALKODO("Gazd�lkod�"),
    TUDOS("Tud�s"),
    TULELO("T�l�l�"),
    KARAVANMESTER("Karav�nmester"),
    EPITESZ("�p�t�sz"),
    STRATEGA("Strat�ga"),
    KUFAR("Kuf�r");

    private String value;

    SzemelyisegEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
} 