package hodito.building.config;

import hodito.enums.BuildingCategory;

public class DefaultConfig implements Config {

    private String name;
    private Integer workers;
    private Integer stone;
    private Integer wood;
    private Integer clay;
    private Integer uniqueProperty;
    private BuildingCategory category;

    @Override
    public Integer getWorkers() {
        return workers;
    }

    @Override
    public void setWorkers(Integer workers) {
        this.workers = workers;
    }

    @Override
    public Integer getStone() {
        return stone;
    }

    @Override
    public void setStone(Integer stone) {
        this.stone = stone;
    }

    @Override
    public Integer getWood() {
        return wood;
    }

    @Override
    public void setWood(Integer wood) {
        this.wood = wood;
    }

    @Override
    public Integer getClay() {
        return clay;
    }

    @Override
    public void setClay(Integer clay) {
        this.clay = clay;
    }

    @Override
    public Integer getUniqueProperty() {
        return uniqueProperty;
    }

    @Override
    public void setUniqueProperty(Integer uniqueProperty) {
        this.uniqueProperty = uniqueProperty;
    }

    @Override
    public BuildingCategory getCategory() {
        return category;
    }

    @Override
    public void setCategory(BuildingCategory category) {
        this.category = category;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

}
