
package dev.models.ammunition;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author E2Ps ICT
 */
public class AmmunitionFactory {

    public static Ammunition create(String classString) {
        {
            try {
                Class<?> ammunitionClass = Class.forName(Ammunition.class.getPackageName() + ".sub." + classString);
                try {
                    try {
                        return (Ammunition) ammunitionClass.getConstructor().newInstance();
                    } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                        Logger.getLogger(AmmunitionFactory.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (NoSuchMethodException | SecurityException ex) {
                    Logger.getLogger(AmmunitionFactory.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AmmunitionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;

    }
}
