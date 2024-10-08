/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dev.models.soldier;

import dev.models.mission.Mission;
import java.util.List;

/**
 *
 * @author E2Ps ICT
 */
public interface Soldier {

    List<String> allowedloadout();

    void Regenerate();

    String getName();

    void setName(String name);

    int getAge();

    void setAge(int age);

    double getExperience();

    void setExperience(double experience);

    double getEndurance();

    void setEndurance(double endurance);

    double getOverall_Skills();

    void setOverall_Skills(double overall_skills);
}
