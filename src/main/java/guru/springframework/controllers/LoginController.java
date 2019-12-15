package guru.springframework.controllers;

import guru.springframework.commands.LoginCommand;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by rfh on 12/15/2019
 */
@Controller
public class LoginController {

    @RequestMapping("login")
    public String loginForm(Model model){
        model.addAttribute("loginCommand", new LoginCommand());

        return "loginform";
    }

    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    public String doLogin(@Valid LoginCommand loginCommand, BindingResult bindingResult) {

        if (bindingResult.hasErrors()){
            return "loginform";
        }

        return "redirect:index";
    }
}
