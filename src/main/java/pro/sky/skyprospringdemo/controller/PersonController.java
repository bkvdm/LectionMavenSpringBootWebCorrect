package pro.sky.skyprospringdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringdemo.domain.Person;
import pro.sky.skyprospringdemo.exceptions.BadPersonNumberException;
import pro.sky.skyprospringdemo.service.PersonService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    //    @GetMapping(path = "/person")
//    public String getPersonInfo(@RequestParam("number") Integer number) {
//        final String person;
//        try {
//            person = personService.getPerson(number);
//        } catch (BadPersonNumberException e) {
//            throw new RuntimeException(e);
//        }
//        return person;
//    }
    @GetMapping(path = "/person/by-passport")
    public String getPersonInfo(@RequestParam("passport") String passport) {
        return personService.getPersonByPassport(passport);
    }

    @GetMapping(path = "/param/add")
    public String addPerson(@RequestParam("name") String name, @RequestParam("surname") String surname, @RequestParam("passport") String passport, @RequestParam("profession") Integer profession) {
        Person person = new Person(name, surname, passport, profession);
        personService.addPerson(person);
        return "person added";
    }

    @GetMapping(path = "person/profession/add")
    public String addProfession(@RequestParam("passport") String passport, @RequestParam("profession") Integer profession) {
        personService.addProfession(passport, profession);
        return "Профессия успешно добавлена";
    }

    @GetMapping(path = "/person/by-profession")
    public String getByProfession(@RequestParam("profession") int profession) {
        final List<Person> personByProfession = personService.getPersonByProfession(profession);
        List<String> passports = new ArrayList<>();
//        for (int i = 0; i < personByProfession.size(); i++) {
//            final Person person = personByProfession.get(i);
//            passports.add(person.getPassport());

        for (int i = 0; i < personByProfession.size(); i++) {
            final Person person = personByProfession.get(i);
            passports.add(person.getPassport());

        }
        return passports.toString();
    }
}


//    @GetMapping(path = "/person")
//    public String getPersonInfo(@RequestParam("number") Integer number) {
//        try {
//            final String person = personService.getPerson(number);
////            if (person == null) {
////                return "Попробуйте другой номер";
////            }
//            return person;
////            return personService.getPerson(number);
//        } catch (BadPersonNumberException e) {
//            return "Попробуйте другой номер";
//        } catch (Exception e) {
//            e.printStackTrace();
//            return "Попробуйте в другой раз";
//        } finally {
//            System.out.println("Работа метода getPersonInfo закончена");
//        }
//    }
//}
