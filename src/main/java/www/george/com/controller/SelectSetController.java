package www.george.com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import www.george.com.service.GetWordService;

import javax.servlet.http.HttpSession;

@Controller
public class SelectSetController {

    @Autowired
    GetWordService getWordService;


    @RequestMapping(value = "selectSet", method = RequestMethod.GET)
    public ModelAndView showWordSet(
            @RequestParam(defaultValue = "-1") int selectOrdelete,
            @RequestParam(defaultValue = "-1") int wordSetOrder,
            HttpSession session

            ){
        String email = (String)session.getAttribute("email");
        if(selectOrdelete==1)//选择添加单词库
        {
            getWordService.insertWordList(wordSetOrder,email);
        }
        else if(selectOrdelete==0)//删除单词库
        {
            getWordService.deleteWordSet(wordSetOrder,email);
        }

        boolean[] x = new boolean[3];
        x[0]=getWordService.checkWordSetExist(1,(String)session.getAttribute("email"));
        x[1]=getWordService.checkWordSetExist(2,(String)session.getAttribute("email"));
        x[2]=getWordService.checkWordSetExist(3,(String)session.getAttribute("email"));
        session.setAttribute("SetExist",x);

        ModelAndView mv = new ModelAndView();
        mv.setViewName("selectSet");
        return mv;
    }





}
