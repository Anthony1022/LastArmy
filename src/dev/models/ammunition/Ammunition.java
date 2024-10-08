/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dev.models.ammunition;

/**
 *
 * @author E2Ps ICT
 */
public interface Ammunition {

    String getName();

    void setName(String name);

    double getWeigth();

    void setWeigth(double weigth);

    double getWearLevel();

    void decrease_wearlevel(int multiplier);

}
