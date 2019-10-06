package eyael_demo.demo.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @RequestMapping (value = "/Holla")
    public String sayHello(){
        return "Hello there...";
    }
}
