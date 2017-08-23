import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@EnableAutoConfiguration
public class MainSpring {

    @RequestMapping("/hello/{name}")
    @ResponseBody
    public String webPage(@PathVariable String name){
        return "First Hello!" + name;
    }


    public static void main(String[] args) {
        SpringApplication.run(MainSpring.class, args);

    }


}
