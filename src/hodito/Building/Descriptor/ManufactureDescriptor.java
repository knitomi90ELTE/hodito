package hodito.Building.Descriptor;

import hodito.Building.Interface.DescriptorInterface;

public class ManufactureDescriptor implements DescriptorInterface {
    private int production;
    private int workers;
    private int stone;
    private int wood;
    private int clay;

    public int getProduction() {
        return production;
    }

    public void setProduction(int production) {
        this.production = production;
    }

    public int getWorkers() {
        return workers;
    }

    public void setWorkers(int workers) {
        this.workers = workers;
    }

    public int getStone() {
        return stone;
    }

    public void setStone(int stone) {
        this.stone = stone;
    }

    public int getWood() {
        return wood;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

    public int getClay() {
        return clay;
    }

    public void setClay(int clay) {
        this.clay = clay;
    }
}
