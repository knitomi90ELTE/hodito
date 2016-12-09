package hodito.building;

import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import hodito.Main;
import hodito.building.config.DefaultConfig;
import hodito.enums.BuildingTypeEnum;

public class BuildingCreator {

    private static final String DATA_FILE = "/data.json";
    private Map<BuildingTypeEnum, DefaultConfig> buildings;
    private ObjectMapper mapper;

    public BuildingCreator() {
        buildings = new HashMap<>();
        mapper = new ObjectMapper();
    }

    public void readData() {
        InputStream dataAsjson = Main.class.getResourceAsStream(DATA_FILE);
        try {
            List<DefaultConfig> configs = Arrays
                    .asList(mapper.configure(DeserializationFeature.READ_ENUMS_USING_TO_STRING, true)
                            .readValue(dataAsjson, DefaultConfig[].class));
            for (DefaultConfig config : configs) {
                buildings.put(BuildingTypeEnum.valueOf(config.getName().toUpperCase()), config);
            }

        } catch (Exception e) {
            System.err.println("Hiba fajlbeolvasas kozben " + e.getMessage());
        }

    }

    /**
     * @return Map
     */
    public Map<BuildingTypeEnum, DefaultConfig> getBuildings() {
        return buildings;
    }
}
