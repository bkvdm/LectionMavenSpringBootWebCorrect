package pro.sky.skyprospringdemo.service;

import pro.sky.skyprospringdemo.domain.Person;
import pro.sky.skyprospringdemo.exceptions.BadPersonNumberException;

import java.util.List;

public interface PersonService {
//    public String getPerson(Integer number) throws BadPersonNumberException;

//    String getPersonByPassport(String passport);

    String getPersonByPassport(String passport);

    void addPerson(Person person);

    void addProfession(String passport, Integer profession);

    List<Person> getPersonByProfession(Integer professionNumber);
//    public String getPerson(Integer number);
}
