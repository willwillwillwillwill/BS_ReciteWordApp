package www.george.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import www.george.com.service.SignUpService;

@Controller
public class HomePageController {
    @Autowired
    SignUpService signUpService;

    @RequestMapping(value = "homepage.com", method = RequestMethod.GET)
    public ModelAndView showHomePage(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("homepage");
        return mv;
    }

    @RequestMapping(value = "user", method = RequestMethod.POST)
    public void signUp(
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName,
            @RequestParam("emailAddress") String emailAddress,
            @RequestParam("password") String password){

        signUpService.signUp(firstName, lastName, emailAddress, password);
    }
}
