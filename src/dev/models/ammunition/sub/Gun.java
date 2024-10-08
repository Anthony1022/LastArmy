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
public class Gun extends BaseAmmunition {
    public Gun(){
        super("Gun", 1.4);
    }
    public Gun(String name, double weigth){
        super(name,weigth);
        
    }
}
