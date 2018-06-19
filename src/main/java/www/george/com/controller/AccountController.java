package www.george.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import www.george.com.service.SignUpService;

@Controller
public class AccountController {
    @Autowired
    private SignUpService signUpService;

    @RequestMapping(value = "/html/activate.html", method = RequestMethod.GET)
    public String activeAccount(@RequestParam(value = "email") String account){
         if (signUpService.activateAccount(account)){
             return "activateSuccessful";
         } else return "activateFailed";
    }
}
