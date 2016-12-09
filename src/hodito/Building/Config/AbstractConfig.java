package hodito.Building.Config;

import hodito.Building.Interface.AbstractConfigInterface;

abstract public class AbstractConfig implements AbstractConfigInterface {
    private int WORKERS;
    private int STONE;
    private int WOOD;
    private int CLAY;

    @Override
    public int getWorkers() {
        return WORKERS;
    }

    @Override
    public void setWorkers(int value) {
        WORKERS = value;
    }

    @Override
    public int getStone() {
        return STONE;
    }

    @Override
    public void setStone(int value) {
        STONE = value;
    }

    @Override
    public int getWood() {
        return WOOD;
    }

    @Override
    public void setWood(int value) {
        WOOD = value;
    }

    @Override
    public int getClay() {
        return CLAY;
    }

    @Override
    public void setClay(int value) {
        CLAY = value;
    }
}
