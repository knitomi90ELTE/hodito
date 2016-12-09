package hodito.Enum;

public enum FajEnum {
    ELF("Elf"),
    ORK("Ork"),
    FELELF("Félelf"),
    TORPE("Törpe"),
    GNOM("Gnóm"),
    ORIAS("Óriás"),
    ELOHALOTT("Élőhalott"),
    EMBER("Ember");

    private String value;

    FajEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
