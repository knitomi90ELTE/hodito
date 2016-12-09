package hodito.enums;

public enum FajEnum {
    ELF("Elf"),
    ORK("Ork"),
    FELELF("F�lelf"),
    TORPE("T�rpe"),
    GNOM("Gn�m"),
    ORIAS("�ri�s"),
    ELOHALOTT("�l�halott"),
    EMBER("Ember");

    private String value;

    FajEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
