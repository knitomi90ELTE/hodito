package hodito.enums;

public enum BuildingTypeEnum {
    
    HAZ("haz"), 
    BARAKK("barakk"), 
    KOVACSMUHELY("kovacsmuhely"), 
    TANYA("tanya"), 
    KONYVTAR("konyvtar"), 
    RAKTAR("raktar"), 
    FATELEP("fatelep"), 
    KOBANYA("kobanya"), 
    FEMBANYA("fembanya"), 
    AGYAGBANYA("agyagbanya"), 
    DRAGAKOBANYA("dragakobanya"), 
    ORTORONY("ortorony"), 
    KOCSMA("kocsma"), 
    TEMPLOM("templom"), 
    KORHAZ("korhaz"), 
    PIA("pia"), 
    BANK("bank");

    private String value;

    BuildingTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
