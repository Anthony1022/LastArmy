
import dev.models.ammunition.Ammunition;
import dev.models.ammunition.AmmunitionFactory;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author E2Ps ICT
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ammunition gun = AmmunitionFactory.create("Gun");
        List<Ammunition> loadout = new LinkedList<>();
        Map<String, Integer> overallsupplies = new HashMap<>();
        overallsupplies.put(gun.getName(), 30);
        System.out.println(checkIfPresent("Gun", overallsupplies));

        if (overallsupplies.containsKey("Gun")) {
            loadout.add(AmmunitionFactory.create("Gun"));
            int getUpdateSupplyCount = overallsupplies.get("Gun") - 1;
            if (getUpdateSupplyCount == 0) {
                overallsupplies.remove("Gun");
            } else {
                overallsupplies.put("Gun", getUpdateSupplyCount);
            }
        }
    }    

    

    private static boolean checkIfPresent(String key, Map<String, Integer> map) {
//        return map.entrySet().stream().anyMatch(pair -> pair.getKey().equals(key));
        return map.containsKey(key);
    }

}
