/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.models.ammunition;

/**
 *
 * @author E2Ps ICT
 */
public class BaseAmmunition implements Ammunition {

    private String _name;
    private double _weigth;
    private double _wear_level;
    
    public BaseAmmunition(String name, double weigth){
        _name = name;
        _weigth = weigth;
        _wear_level = _weigth * 100;
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
    public double getWeigth() {
        return _weigth;
    }

    @Override
    public void setWeigth(double weigth) {
        _weigth = weigth;
    }

    @Override
    public double getWearLevel() {
       return _wear_level;
    }

    @Override
    public void decrease_wearlevel(int multiplier) {
       
    }

    
}
