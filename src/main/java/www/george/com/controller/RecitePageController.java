package www.george.com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import www.george.com.dao.MyWordBook;
import www.george.com.Entity.WordInfo;
import www.george.com.dao.WordSet;
import www.george.com.service.GetWordService;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class RecitePageController {

    @Autowired
    GetWordService getWordService;

    @RequestMapping(value = "recite", method = RequestMethod.GET)//recite word page
    public ModelAndView showRecite(
            @RequestParam int order,
            @RequestParam(defaultValue = "-1") int num,
            @RequestParam(defaultValue = "-1") int know,
            HttpSession session,
            Model model
    )
    {
        String email = (String) session.getAttribute("email");
        List<WordSet> word;
        ModelAndView mv = new ModelAndView();
        WordInfo wi = new WordInfo();
        if(getWordService.checkWordSetExist(order,email)==false)
        {
            model.addAttribute("warning","this wordset isn't set");
            mv.setViewName( "userHomePage");

            return mv;
        }

        if(num == -1) {//如果是第一次
            word = getWordService.getWord(email, order,0,10);//建立集合
            session.setAttribute("tenword",word);//存放到session里

            wi.setOrder(order);
            wi.setWs(word.get(0));
            wi.setNum(0);

        }
        else
        {
            word = (List<WordSet>) session.getAttribute("tenword");
            if(know!=-1&&know!=2)
                getWordService.updateWord(email,order,word.get(num-1).getId(),know);
            if(know==2)//添加入单词本
            {
                getWordService.insertMyWordBook(email,order,word.get(num).getId());//插入当前单词的信息
            }
            if(num==word.size())
            {
                mv.setViewName("reciteEnd");
                return mv;
            }
            wi.setOrder(order);
            wi.setWs(word.get(num));
            wi.setNum(num);

        }
        model.addAttribute("word",wi);
        mv.setViewName("recite");
        return mv;
    }

    @RequestMapping(value="myBook",method = RequestMethod.GET)//myBook word list
    public ModelAndView showMyBook(
            @RequestParam(defaultValue = "-1") int deleteId,
            HttpSession session,Model model)
    {
        String email = (String)session.getAttribute("email");
        ModelAndView mv=new ModelAndView();
        List<MyWordBook> wl = getWordService.selectMyWordInfo(email);
        if(deleteId>-1)
        {
            getWordService.deleteMyBookWord(wl.get(deleteId).getWordSetOrder(),email,wl.get(deleteId).getWordId());
        }
        model.addAttribute("list",getWordService.getAllMyBookWord(email));
        mv.setViewName("myBook");
        return mv;
    }

}
