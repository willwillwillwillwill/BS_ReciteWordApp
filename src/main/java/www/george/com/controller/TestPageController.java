package www.george.com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import www.george.com.Entity.WordInfo;
import www.george.com.dao.WordSet;
import www.george.com.service.GetWordService;

import javax.servlet.http.HttpSession;
import java.util.Collections;
import java.util.List;

@Controller
public class TestPageController {

    @Autowired
    GetWordService getWordService;



    @RequestMapping(value = "test", method = RequestMethod.GET)
    public ModelAndView showTest(
            @RequestParam int order,
            @RequestParam(defaultValue = "-1") int num,
            @RequestParam(defaultValue = "1") int know,
            Model model,
            HttpSession session
    )
    {
        String email = (String)session.getAttribute("email");



        ModelAndView mv = new ModelAndView();
        WordInfo wi = new WordInfo();
        if(getWordService.checkWordSetExist(order,email)==false)
        {
            model.addAttribute("warning","this wordset isn't set");
            mv.setViewName( "userHomePage");

            return mv;
        }
        List<WordSet> wl;
        List<WordSet> randomWord=null;
        if(num==10)
        {
            mv.setViewName("testEnd");
            return mv;
        }
        else if(num==-1)
        {
            wl = getWordService.getWord(email,order,1,10);
            session.setAttribute("wordList",wl);
            wi.setOrder(order);
            wi.setWs(wl.get(0));
            wi.setNum(0);

        }
        else
        {
            wl =( List<WordSet>)session.getAttribute("wordList");
            wi.setOrder(order);
            wi.setWs(wl.get(num));
            wi.setNum(num);
        }
        WordSet word =wi.getWs();
        int bk=1;
        while(true)
        {
            if(bk==0)
                break;
            bk=0;
            randomWord=getWordService.getWord(email,order,1,3);
            for(WordSet w:randomWord)
            {
                if(w.getWord().equals(word.getWord()))
                {
                    bk=1;
                    break;
                }

            }//检测是否有重复
        }
        model.addAttribute("word",wi);
        randomWord.add(word);
        Collections.shuffle(randomWord);
        wi.setRandomWord(randomWord);
        mv.setViewName("test");
        //List<WordSet> word = getWordService.getWord(email,wordSetOrder);
        return mv;
    }


}
