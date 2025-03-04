/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.b23902.headhunters.heretic.sheadhunters;

import java.util.ArrayList;

/**
 *
 * @author Настя
 */
public class Controller {

    ArrayList<Heretic> heretics = new ArrayList<>();

    public Heretic createHeretic() {
        DataGenerator dg = new DataGenerator();
        Heretic heretic = new Heretic(dg.getFakeName(), dg.getFakeCriminal(), dg.getFakePlace(), dg.getFakeId(), dg.getFakeMenace());
        heretics.add(heretic);
        return heretic;
    }

    public ArrayList<Heretic> getHeretics() {
        return heretics;
    }

    public String[] getNames() {
        String[] names = new String[heretics.size()];
        for (int i = 0; i < heretics.size(); i++) {
            names[i] = (heretics.get(i).getName());
        }
        return names;
    }

}
