package pro.sky.skyprospringdemo.service;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringdemo.domain.Driver;
import pro.sky.skyprospringdemo.domain.Person;
import pro.sky.skyprospringdemo.domain.TruckDriver;

import java.util.*;

@Service
public class PersonServiceImpl implements PersonService {
    private List<Person> ArrayList;
    //    Person[] persons = {
//            new Person("Жан", "Рено", "12345", 2),
//            new Person("Жерар", "Депардье", "41232", 2),
//            new Person("Люк", "Бессон", "54321", 1),
//            new Driver("Джейсон", "Стетхэм", "34789", "2353", 0),
//            new TruckDriver("Роберт", "Патрик", "49022", "1000",3)
//    };
//    List<Person> persons = List.of(
//    List<Person> persons = new ArrayList<>(List.of(
    Map<String, Person> persons = new HashMap<>(Map.of(
            "12345", new Person("Жан", "Рено", "12345", 2),
            "41232", new Person("Жерар", "Депардье", "41232", 2),
            "54321", new Person("Люк", "Бессон", "54321", 1),
            "34789", new Driver("Джейсон", "Стетхэм", "34789", "2353", 0),
            "49022", new TruckDriver("Роберт", "Патрик", "49022", "1000", 3)
    ));

    String[] professions = {"безработный", "водитель", "плотник", "столяр", "актёр"};

//    @Override
//    public String getPerson(Integer number) throws BadPersonNumberException {
////    public String getPerson(Integer number) {
//        final Person person;
////        if (number >= persons.length) {
//        if (number >= persons.size()) {
////            return null;
//            throw new BadPersonNumberException("Ошибка в том, что номер человека по списку, больше размера массива");
//        }
////        person = persons[number];
//        person = persons.get(number);
//        final String personDescription = ""
//                + person.getName() + " "
//                + person.getSurname() + " "
//                + person.getPassport() + " "
//                + professions[person.getProfessionNumber()];
//        return personDescription;
//    }


    @Override
    public String getPersonByPassport(String passport) {
//        for (Person person : persons) {
//        for (Person person : persons.values()) {
        final Person person = persons.get(passport);
//        if (person.getPassport().equals(passport)) {
//        }
        if (person == null) {
            throw new RuntimeException("Человек с таким номером паспорта не найден");
        }
        final String personDescription = ""
                + person.getName() + " "
                + person.getSurname() + " "
                + person.getPassport() + " "
//                + professions[person.getProfessionNumbers()];
                + getProfessionNames(person.getProfessionNumbers());
        return personDescription;
//        }
    }

//    private String getProfessionNames(List<Integer> professionNumbers) {
    private String getProfessionNames(Set<Integer> professionNumbers) {
        String result = "";
        for (Integer professionNumber : professionNumbers) {
            result = result + professions[professionNumber];
        }
        return result;
    }

    @Override
    public void addPerson(Person person) {
//        persons.add(person);
        persons.put(person.getPassport(), person);
    }

    @Override
    public void addProfession(String passport, Integer profession) {
        final Person person = persons.get(passport);
        if (passport == null) {
            throw new RuntimeException("Человек с таким именем паспорта не найден");
        }
//        if (!person.getProfessionNumbers().contains(profession)) {
//        person.getProfessionNumbers().add(profession);
//        }
    }

    @Override
    public List<Person> getPersonByProfession(Integer professionNumber) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons.values()) {
            if (person.getProfessionNumbers().contains(professionNumber)) {
                result.add(person);
            }
        }
        return result;
    }
}
