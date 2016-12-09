package hodito.Building.Config;

public class RaktarConfig extends AbstractBuildingConfig {

    private final int GABONA = 1000;
    private final int FA = 300;
    private final int AGYAG = 300;
    private final int KO = 300;
    private final int FEM = 300;
    private final int DRAGAKO = 300;
    private final int FEGYVER = 100;

    public RaktarConfig() {
        this.setWorkers(15);
        this.setStone(48);
        this.setWood(48);
        this.setClay(48);
    }

    public int getGabona() {
        return GABONA;
    }

    public int getFa() {
        return FA;
    }

    public int getAgyag() {
        return AGYAG;
    }

    public int getKo() {
        return KO;
    }

    public int getFem() {
        return FEM;
    }

    public int getDragako() {
        return DRAGAKO;
    }

    public int getFegyver() {
        return FEGYVER;
    }
}
