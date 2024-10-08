/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.models.soldier.sub;

import java.util.Arrays;

import dev.models.soldier.BaseSoldier;

/**
 *
 * @author E2Ps ICT
 */
public class Ranker extends BaseSoldier {
    public Ranker(String name, int age, double experience, double endurance) {
        super(name, age, experience, endurance);
    }

    @Override
    public List<String> allowedloadout() {
        return Arrays.asList("Gun","Helmet","Knife");
    }

    @Override
    public void regenerate() {
        endurance = 10 + age;
    }
}
