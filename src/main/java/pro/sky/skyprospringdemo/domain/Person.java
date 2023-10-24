package pro.sky.skyprospringdemo.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Person {
    private String name;
    private String surname;
    private String passport;
//    private int professionNumbers;
//    private List<Integer> professionNumbers;
    private Set<Integer> professionNumbers;

    public Person(String name, String surname, String passport, int professionNumber) {
        this.name = name;
        this.surname = surname;
        this.passport = passport;
//        this.professionNumbers = professionNumber;
//        this.professionNumbers = new ArrayList<>(List.of(professionNumber));
        this.professionNumbers = new HashSet<>(List.of(professionNumber));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }
//    public int getProfessionNumbers() {
//        return professionNumbers;
//    }
//    public List<Integer> getProfessionNumbers() {
//        return professionNumbers;
//    }
    public Set<Integer> getProfessionNumbers() {
        return professionNumbers;
    }

//    public void setProfessionNumbers(int professionNumbers) {
//        this.professionNumbers = professionNumbers;
//    }

    public void changePassportNumber(String passport) {

        if (passport != null && !passport.isBlank()) {
            this.passport = passport;
        }
    }
}
