package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rfh on 12/8/2019
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String getIndex() {
        return "index";
    }
}
