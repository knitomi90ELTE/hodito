package hodito.Building.Config;

import hodito.Building.Interface.BuildingConfigInterface;

abstract public class AbstractBuildingConfig extends AbstractConfig implements BuildingConfigInterface {
    private int PLACE;

    @Override
    public int getPlace() {
        return PLACE;
    }

    @Override
    public void setPlace(int value) {
        PLACE = value;
    }
}
