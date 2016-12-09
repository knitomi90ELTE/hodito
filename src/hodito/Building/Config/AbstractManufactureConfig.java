package hodito.Building.Config;

import hodito.Building.Interface.ManufactureConfigInterface;

abstract public class AbstractManufactureConfig extends AbstractConfig implements ManufactureConfigInterface {
    private int PRODUCTION;

    @Override
    public int getProduction() {
        return PRODUCTION;
    }

    @Override
    public void setProduction(int value) {
        PRODUCTION = value;
    }
}
