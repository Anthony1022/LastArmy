/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.models.ammunition.sub;

import dev.models.ammunition.BaseAmmunition;

/**
 *
 * @author E2Ps ICT
 */
public class AutomaticMachine extends BaseAmmunition {

    public AutomaticMachine() {
        super("AutomaticMachine", 6.3);
    }
    public AutomaticMachine(String name, double weigth){
        super(name,weigth);
        
    }
}
