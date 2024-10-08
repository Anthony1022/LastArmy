/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.models.soldier;

import dev.models.mission.Mission;
import java.util.List;

/**
 *
 * @author E2Ps ICT
 */
public class BaseSoldier implements Soldier {
    private double _overall_skills;
    private String _name;
    private int _age;
    private double _experience;
    private double _endurance;
    
    

    public BaseSoldier(String name, int age, double experience, double endurance) {

        _name = name;
        _age = age;
        _experience = experience;
        _endurance = endurance;
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;
    }

    @Override
    public int getAge() {
        return _age;
    }

    @Override
    public void setAge(int age) {
        _age = age;
    }

    @Override
    public double getExperience() {
        return _experience;
    }

    @Override
    public void setExperience(double experience) {
        _experience = experience;
    }

    @Override
    public double getEndurance() {
        return _endurance;
    }

    @Override
    public void setEndurance(double endurance) {
        _endurance = endurance;
    }

    

    @Override
    public double getOverall_Skills() {
        return _overall_skills;
    }

    @Override
    public void setOverall_Skills(double overall_skills) {
        _overall_skills = overall_skills;
    }

    @Override
    public List<String> allowedloadout() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Regenerate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
