/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.models.soldier;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author E2Ps ICT
 */
public class SoldierFactory {

    public static <T> T create(Class<T> t) {
         {
             try {
                 return t.getConstructor().newInstance();
             } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                 Logger.getLogger(SoldierFactory.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        return null;
    }
}