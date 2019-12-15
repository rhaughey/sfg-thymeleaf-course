package guru.springframework.controllers;

import guru.springframework.commands.CheckoutCommand;
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
public class CheckoutController {

    @RequestMapping("checkout")
    public String checkoutForm(Model model) {
        model.addAttribute("checkoutCommand", new CheckoutCommand());

        return "checkoutform";
    }

    @RequestMapping(value = "/doCheckout", method = RequestMethod.POST)
    public String doCheckout(@Valid CheckoutCommand checkoutCommand, BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            return "checkoutform";
        }

        return "checkoutcomplete";
    }
}
