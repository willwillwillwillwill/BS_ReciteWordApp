package www.george.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("myController")
@RequestMapping("/my")
public class MyController {
    @RequestMapping("/index")
    public String index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return "/jsp/index.jsp";
    }
}
