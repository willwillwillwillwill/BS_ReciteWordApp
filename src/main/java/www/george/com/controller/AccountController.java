package www.george.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import www.george.com.service.SignUpService;

@Controller
public class AccountController {
    @Autowired
    private SignUpService signUpService;

    @RequestMapping(value = "account", method = RequestMethod.GET)
    public String activeAccount(@RequestParam(value = "user") String account){
         signUpService.activateAccount(account);

         return "homepage";
    }
}
