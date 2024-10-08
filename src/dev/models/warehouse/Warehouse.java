/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dev.models.warehouse;

import dev.models.soldier.Soldier;

/**
 *
 * @author E2Ps ICT
 */
public interface Warehouse {
    void addSupply(String ammunitionString, Integer count);
    boolean checkSupply(Soldier soldier);
}
