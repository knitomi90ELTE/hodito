package hodito.Controller;

import hodito.Building.BuildingCreator;
import hodito.Enum.BuildingTypeEnum;
import hodito.Building.Interface.DescriptorInterface;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.HashMap;
import java.util.Map;

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

    public BuildingController(){
        BuildingCreator buildingCreator = new BuildingCreator();
        Map<BuildingTypeEnum, DescriptorInterface> buildings = buildingCreator.getBuildings();
    }

    private Map<BuildingTypeEnum, Integer> inputs = new HashMap<>();

    @FXML
    public void onAction(){
        inputs.put(BuildingTypeEnum.HAZ, Integer.parseInt(haz.getText()));
        inputs.put(BuildingTypeEnum.BARAKK, Integer.parseInt(barakk.getText()));
    }
}
