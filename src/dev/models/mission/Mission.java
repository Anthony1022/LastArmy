/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dev.models.mission;

/**
 *
 * @author E2Ps ICT
 */
public interface Mission {

    double getScore_to_complete();

    void setScore_to_complete(double score_to_complete);

    int getEndurnce();

    void setEndurance(int endurance);

    String getName();

    void setName(String name);
}
