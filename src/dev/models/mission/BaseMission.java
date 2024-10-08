/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.models.mission;

/**
 *
 * @author E2Ps ICT
 */
public class BaseMission implements Mission {
    private String _name;
    private int _endurance;
    private double _score_to_complete;
    boolean _isready = false;
    boolean _completemission = false;
    private int _ammunition;
    
    public BaseMission(String name, int endurance, double score_to_complete, int ammunition) {
        _name = name;
        _score_to_complete = score_to_complete;
        _endurance = endurance;
        _ammunition = ammunition;

    }

    @Override
    public double getScore_to_complete() {
        return _score_to_complete;
    }

    @Override
    public void setScore_to_complete(double score_to_complete) {
        _score_to_complete = score_to_complete;
    }

    @Override
    public int getEndurnce() {
        return _endurance;
    }

    @Override
    public void setEndurance(int endurance) {
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
}
