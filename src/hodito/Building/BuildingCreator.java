package hodito.Building;

import java.util.HashMap;
import java.util.Map;

import hodito.Building.Config.AbstractBuildingConfig;
import hodito.Building.Config.AbstractManufactureConfig;
import hodito.Building.Config.AgyagbanyaConfig;
import hodito.Building.Config.BarakkConfig;
import hodito.Building.Config.DragakobanyaConfig;
import hodito.Building.Config.FatelepConfig;
import hodito.Building.Config.FembanyaConfig;
import hodito.Building.Config.HazConfig;
import hodito.Building.Config.KobanyaConfig;
import hodito.Building.Config.KocsmaConfig;
import hodito.Building.Config.KonyvtarConfig;
import hodito.Building.Config.KovacsmuhelyConfig;
import hodito.Building.Config.OrtoronyConfig;
import hodito.Building.Config.RaktarConfig;
import hodito.Building.Config.TanyaConfig;
import hodito.Building.Config.TemplomConfig;
import hodito.Building.Descriptor.BuildingDescriptor;
import hodito.Building.Descriptor.ManufactureDescriptor;
import hodito.Building.Interface.DescriptorInterface;
import hodito.Enum.BuildingTypeEnum;

public class BuildingCreator {

    private Map<BuildingTypeEnum, DescriptorInterface> buildings;

    public BuildingCreator() {
	buildings = new HashMap<>();
	buildings.put(BuildingTypeEnum.HAZ, createBuilding(new HazConfig()));
	buildings.put(BuildingTypeEnum.BARAKK, createBuilding(new BarakkConfig()));
	buildings.put(BuildingTypeEnum.KOVACSMUHELY, createManufacture(new KovacsmuhelyConfig()));
	buildings.put(BuildingTypeEnum.TANYA, createManufacture(new TanyaConfig()));
	buildings.put(BuildingTypeEnum.KONYVTAR, createManufacture(new KonyvtarConfig()));
	buildings.put(BuildingTypeEnum.RAKTAR, createBuilding(new RaktarConfig()));
	buildings.put(BuildingTypeEnum.FATELEP, createManufacture(new FatelepConfig()));
	buildings.put(BuildingTypeEnum.KOBANYA, createManufacture(new KobanyaConfig()));
	buildings.put(BuildingTypeEnum.FEMBANYA, createManufacture(new FembanyaConfig()));
	buildings.put(BuildingTypeEnum.AGYAGBANYA, createManufacture(new AgyagbanyaConfig()));
	buildings.put(BuildingTypeEnum.DRAGAKOBANYA, createManufacture(new DragakobanyaConfig()));
	buildings.put(BuildingTypeEnum.ORTORONY, createBuilding(new OrtoronyConfig()));
	buildings.put(BuildingTypeEnum.KOCSMA, createBuilding(new KocsmaConfig()));
	buildings.put(BuildingTypeEnum.TEMPLOM, createBuilding(new TemplomConfig()));
    }

    /**
     * @return BuildingDescriptor
     */
    private BuildingDescriptor createBuilding(AbstractBuildingConfig config) {
	BuildingDescriptor descriptor = new BuildingDescriptor();
	descriptor.setPlace(config.getPlace());
	descriptor.setWorkers(config.getWorkers());
	descriptor.setWood(config.getStone());
	descriptor.setStone(config.getWood());
	descriptor.setClay(config.getClay());
	return descriptor;
    }

    /**
     * @return ManufactureDescriptor
     */
    private ManufactureDescriptor createManufacture(AbstractManufactureConfig config) {
	ManufactureDescriptor descriptor = new ManufactureDescriptor();
	descriptor.setProduction(config.getProduction());
	descriptor.setWorkers(config.getWorkers());
	descriptor.setWood(config.getStone());
	descriptor.setStone(config.getWood());
	descriptor.setClay(config.getClay());
	return descriptor;
    }

    /**
     * @return Map
     */
    public Map<BuildingTypeEnum, DescriptorInterface> getBuildings() {
	return buildings;
    }
}
