/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.b23902.headhunters.heretic.sheadhunters;

import com.github.javafaker.Faker;

/**
 *
 * @author Настя
 */


public class DataGenerator {
    Faker faker = new Faker();
    String fakeName = faker.name().fullName();
    String fakePlace = faker.address().streetAddress();
    long fakeCriminal = Math.round(Math.random()*2);
    String fakeId = faker.idNumber().valid();
    long fakeMenace = Math.round(Math.random()*3);

    public String getFakeName() {
        return fakeName;
    }
    public String getFakePlace() {
        return fakePlace;
    }
    public long getFakeCriminal() {
        return fakeCriminal;
    }
    public String getFakeId() {
        return fakeId;
    }
    public long getFakeMenace() {
        return fakeMenace;
    }   
}
