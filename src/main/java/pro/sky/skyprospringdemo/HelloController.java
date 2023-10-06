package pro.sky.skyprospringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {
    //    private HelloService helloService = new HelloService();
//    private final HelloService helloService;
//private final HelloService helloService;
    private final HelloService helloService;
    //    public HelloController(HelloService helloService) {

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    public String hello() {
//        return "<b>hello</b>";
        return helloService.hello();
    }

    //    http://localhost:8080/hello?name=sarah
    @GetMapping(path = "/hello")
    public String answerHello(@RequestParam("name") String userName) {
        return helloService.answerHello(userName);
    }
}
