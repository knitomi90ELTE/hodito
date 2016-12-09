package hodito.controller;

import java.util.HashMap;
import java.util.Map;

import hodito.building.BuildingCreator;
import hodito.building.config.DefaultConfig;
import hodito.enums.BuildingTypeEnum;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * @author https://github.com/knitomi90ELTE/Buildings/blob/master/src/buildings/Building.java
 * @author https://github.com/knitomi90ELTE/AdminSystemJFX/blob/master/src/main/resources/view/pages/UserView.fxml
 */
public class BuildingController {

    @FXML
    private TextField haz;

    @FXML
    private TextField barakk;

    @FXML
    private TextField tanya;

    private Map<BuildingTypeEnum, Integer> inputs;

    public BuildingController() {
        inputs = new HashMap<>();
        BuildingCreator buildingCreator = new BuildingCreator();
        buildingCreator.readData();
        Map<BuildingTypeEnum, DefaultConfig> buildings = buildingCreator.getBuildings();
        System.out.println(buildings.size());
    }

    @FXML
    public void onAction() {
        inputs.put(BuildingTypeEnum.HAZ, Integer.parseInt(haz.getText()));
        inputs.put(BuildingTypeEnum.BARAKK, Integer.parseInt(barakk.getText()));
    }
}
