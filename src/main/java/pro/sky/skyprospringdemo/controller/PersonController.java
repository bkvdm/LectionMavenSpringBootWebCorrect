package pro.sky.skyprospringdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringdemo.exceptions.BadPersonNumberException;
import pro.sky.skyprospringdemo.service.PersonService;

@RestController
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping(path = "/person")
    public String getPersonInfo(@RequestParam("number") Integer number) {
        final String person;
        try {
            person = personService.getPerson(number);
        } catch (BadPersonNumberException e) {
            throw new RuntimeException(e);
        }
        return person;
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
