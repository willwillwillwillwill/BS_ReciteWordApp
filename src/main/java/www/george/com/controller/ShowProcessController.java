package www.george.com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import www.george.com.Entity.WordSetInfo;
import www.george.com.service.GetWordService;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ShowProcessController {

    @Autowired
    GetWordService getWordService;
    @RequestMapping(value = "showProcess", method = RequestMethod.GET)
    public ModelAndView showWordSet(
            HttpSession session,
            ModelMap model){
        ModelAndView mv = new ModelAndView();
        String email = (String)session.getAttribute("email");
        List<WordSetInfo> list=new ArrayList<WordSetInfo>();
        for(int i=1;i<=3;i++) {
            WordSetInfo w=new WordSetInfo();
            w.setWordSet(i);
            w.setAllWord(getWordService.getWordCount(email,i,-1));
            w.setLearnWord(getWordService.getWordCount(email,i,1));
            list.add(w);
        }
        list.get(0).setName("Cet4");
        list.get(1).setName("Cet6");
        list.get(2).setName("GRE");
        model.addAttribute("list",list);



        mv.setViewName("showProcess");
        return mv;
    }




}
