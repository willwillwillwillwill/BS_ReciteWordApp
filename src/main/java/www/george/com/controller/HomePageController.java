package www.george.com.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.ModelAndView;
import www.george.com.service.GetWordService;
import www.george.com.service.LoginService;
import www.george.com.service.SignUpService;


import javax.servlet.http.HttpSession;

@Controller
public class HomePageController {
    @Autowired
    SignUpService signUpService;
    @Autowired
    GetWordService getWordService;
    @Autowired
    LoginService loginService;
    @RequestMapping(value = "homepage.com", method = RequestMethod.GET)
    public ModelAndView showHomePage(
    ){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("homepage");



        return mv;
    }//login interface

   @RequestMapping(value = "user", method = RequestMethod.POST)
    public String signUp(

            @RequestParam("email") String email,
            @RequestParam("password") String password,Model model) {


        if(signUpService.signUp(email, password))
        {
            model.addAttribute("warning","to check the email to finish register");
        }
        else
        {
            model.addAttribute("warning","the email has been registered");
        }
        return "homepage";

    }
    @RequestMapping(value="testBootStrap",method =RequestMethod.GET )
     public ModelAndView showBoot()
        {
            ModelAndView mv = new ModelAndView();
            mv.setViewName("testBootStrap");
            return mv;
        }
    @RequestMapping(value = "userHomePage", method = RequestMethod.POST)//login
    @ResponseBody
    public ModelAndView showWordSet(
            @RequestParam String email,
            @RequestParam String password,
            HttpSession session,
            ModelMap model){
        ModelAndView mv = new ModelAndView();
        if(loginService.Login(email,password))
        {
            session.setAttribute("email",email);
            mv.setViewName("userHomePage");
        }
        else
        {
            model.addAttribute("warning","the user or the password is not correct");
            mv.setViewName("homepage");
        }




        return mv;
    }//after login homepage

    @RequestMapping(value = "userHomePage", method = RequestMethod.GET)//jump from inner page
    public ModelAndView showUserHomePage(
            HttpSession session,
            ModelMap model){


        ModelAndView mv = new ModelAndView();
        mv.setViewName("userHomePage");
        return mv;
    }


}
