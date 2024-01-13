package app.daou.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        Map<String, String> map = new HashMap<>();
        map.put("data","hello!!");
        model.addAllAttributes(map);
        return "hello";
    }
}
