/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dev.models.army;

import dev.models.soldier.Soldier;
import java.util.List;

/**
 *
 * @author E2Ps ICT
 */
public interface Army {

    List<Soldier> getSoldier();

    void addSoldier(Soldier soldier);

    void regenerate(Soldier... soldier);

}
