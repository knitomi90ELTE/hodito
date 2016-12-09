package hodito.enums;

public enum FajEnum {
    ELF("Elf"),
    ORK("Ork"),
    FELELF("Félelf"),
    TORPE("Törpe"),
    GNOM("Gnóm"),
    ORIAS("Óriás"),
    ELOHALOTT("Élõhalott"),
    EMBER("Ember");

    private String value;

    FajEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
