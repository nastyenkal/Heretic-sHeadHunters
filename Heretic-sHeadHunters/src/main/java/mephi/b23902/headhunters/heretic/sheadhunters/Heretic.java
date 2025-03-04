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
    ArrayList<String> criminals = new ArrayList<>(Arrays.asList("murder", "robbery",
            "burglary", "arson", "blackmail", "fraud", "kidnapping"));
    String place;
    String id;
    ArrayList<String> menace = new ArrayList<>(Arrays.asList("low", "middle", "high", "critical"));
    String crime;
    String menace_level;

    public Heretic(String name, int fakeCriminal, String place, String id, int fakeMenace) {
        this.name = name;
        this.place = place;
        this.id = id;
        this.crime = criminals.get(fakeCriminal);
        this.menace_level = menace.get(fakeMenace);
    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    public String getID() {
        return id;
    }

    public String getCrime() {
        return crime;
    }

    public String getMenaceLevel() {
        return menace_level;
    }

    public String getInfo() {
        String info = "Name: " + name + ". Last seen at: " + place + ". ID: " + id + ". Committed crimes: " + crime + ". Threat level: " + menace_level;
        return info;

    }

}
