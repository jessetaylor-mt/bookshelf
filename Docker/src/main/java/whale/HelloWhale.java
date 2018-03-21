package whale;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWhale {

    @RequestMapping("/")
    public String home() {
        return "This application is running in a docker container!!";
    }

}