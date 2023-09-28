package pro.sky.skyprospringdemo;

import org.springframework.stereotype.Service;

//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
@Service
//public class HelloService {
public class HelloServiceImpl implements HelloService {
    public String hello() {
        return "<b>hello</b>";
    }

    //    http://localhost:8080/hello?name=sarah
//    @GetMapping(path = "/hello")
//    public String answerHello(@RequestParam("name") String userName) {
    public String answerHello(String userName) {
        return "<b>hello</b> " + userName;
    }
}
