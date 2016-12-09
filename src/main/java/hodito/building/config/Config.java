package hodito.building.config;

import hodito.enums.BuildingCategory;

public interface Config {

    String getName();

    void setName(String name);

    Integer getWorkers();

    void setWorkers(Integer workers);

    Integer getStone();

    void setStone(Integer stone);

    Integer getWood();

    void setWood(Integer wood);

    Integer getClay();

    void setClay(Integer clay);

    Integer getUniqueProperty();

    void setUniqueProperty(Integer uniqueProperty);

    BuildingCategory getCategory();

    void setCategory(BuildingCategory category);

}
