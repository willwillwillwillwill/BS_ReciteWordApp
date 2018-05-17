package www.george.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/params")
public class MyController {
    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping("/submit")
    public ModelAndView submit(
            @RequestParam(value = "roleName", required = false) String roleName,
            @RequestParam(value = "note", required = false) String note){
        ModelAndView mv = new ModelAndView();
        System.out.println(roleName + note);
        mv.setViewName("show");
        return mv;
    }
}
