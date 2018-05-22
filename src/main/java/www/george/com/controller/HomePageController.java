package www.george.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {
    @RequestMapping("homepage")
    public ModelAndView showHomePage(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("homepage");
        return mv;
    }
}
