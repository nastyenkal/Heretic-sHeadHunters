/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.b23902.headhunters.heretic.sheadhunters;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Настя
 */
public class Heretic {

    String name;
    ArrayList<String> criminals = new ArrayList<>(Arrays.asList("murder", "robbery", "bulglary"));
    String place;
    int id;
    ArrayList<String> menace = new ArrayList<>(Arrays.asList("low", "middle", "high", "critical"));
    String crime;
    String level;

    public Heretic(String name, long fakeCriminal, String place, int id, long fakeMenace) {
        this.name = name;
        this.place = place;
        this.id = id;
        this.crime = criminals.get(fakeCriminal.intValue());
    }

}
