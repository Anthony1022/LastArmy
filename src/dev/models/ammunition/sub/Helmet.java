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
public class Helmet extends BaseAmmunition {

    public Helmet() {
        super("Helmet", 2.3);

    }
    public Helmet(String name, double weigth){
        super(name,weigth);
        
    }
}
