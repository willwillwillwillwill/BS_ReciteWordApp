package www.george.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.george.com.dao.MyWordBook;
import www.george.com.dao.WordSet;
import www.george.com.mapper.UserWordSetMapper;
import www.george.com.mapper.WordSetMapper;

import java.util.ArrayList;
import java.util.List;



@Service
public class GetWordService {
    @Autowired
    private WordSetMapper wsm;
    @Autowired
    private UserWordSetMapper uwsm;
    public void deleteWordSet(int wordSetOrder,String email)
    {
        uwsm.deleteWordSetInfo(email,wordSetOrder);
        uwsm.deleteWordByWordSetOrder(wordSetOrder,email);
    }
    public List<WordSet> generateRandomWordSet(int wordSetOrder,String email,int wordStatus,int randomSize)
    {
        int wordSize= uwsm.getWordCount(wordSetOrder,email,wordStatus);//获取当前数据集用户某状态的个数
        int rd;
        List<Integer> wordIdList = new ArrayList<Integer>() ;
        List<Integer> allWordId=uwsm.getAllWordId(wordSetOrder,email,wordStatus);
        List<Integer> wordRealIdList = new ArrayList<Integer>() ;
        List<WordSet> wordList= new ArrayList<WordSet>();
        while(wordIdList.size()<randomSize)//选取不同的randomsize个序号
        {
            rd=(int)(Math.random()*wordSize);
            if(wordIdList.contains(rd)==false)
                wordIdList.add(rd);

        }//产生[0,size)的十个随机数放置在wrodIdList
        for(int i:wordIdList)
        {
            wordRealIdList.add(allWordId.get(i));
        }//将该10个实际单词序号添加到wordRealIdList中
        for(int i:wordRealIdList)
        {
            wordList.addAll(wsm.getSingleWord(i,wordSetOrder));
        }
        return wordList;
    }
    public List<WordSet> getWord(String email ,int wordSetOrder,int wordStatus,int randomSize)
    {
        List<WordSet> ws = generateRandomWordSet(wordSetOrder,email,wordStatus,randomSize);
        return ws;



    }
    public boolean checkWordSetExist(int wordSetOrder,String email)
    {

        List<Integer> existWordSet = uwsm.getExistWordSet(email);
        for(Integer i:existWordSet)
        {
            if(i.intValue()==wordSetOrder)
                return true;
        }
        return false;
    }
    public void insertWordList(int wordSetOrder,String email)
    {
        uwsm.insertUserWordSetInfo(email,wordSetOrder);

        List<WordSet> l = wsm.getAllWord(wordSetOrder);


        uwsm.insertWord(email, wordSetOrder, l, 0);



        return;
    }
    public int getWordCount(String email,int wordSetOrder,int wordStatus)
    {
        int count=0;
        if(wordStatus==-1)
        {
           count=wsm.getWordSetCount(wordSetOrder);
        }
        else
        {
            count=uwsm.getWordCount(wordSetOrder,email,wordStatus);
        }
        return count;
    }
    public void updateWord(String email,int wordSetOrder,int wordId,int wordStatus)
    {
        uwsm.updateWord(email,wordSetOrder,wordId,wordStatus);
        return;
    }
    public void insertMyWordBook(String email,int wordSetOrder,int wordId)
    {
        uwsm.insertMyBookWord(email,wordSetOrder,wordId);
    }
    public List<MyWordBook> selectMyWordInfo(String email)
    {
        return uwsm.selectAllWordFromMyWordBook(email);
    }
    public List<WordSet> getAllMyBookWord(String email)
    {
        List<MyWordBook> myWordBooks=uwsm.selectAllWordFromMyWordBook(email);
        List<WordSet> word=new ArrayList<WordSet>();
        for(MyWordBook m:myWordBooks)
        {
            word.addAll(wsm.getSingleWord(m.getWordId(),m.getWordSetOrder()));
        }
        return word;
    }
    public void deleteMyBookWord(int wordSetOrder,String email,int wordId)
    {
        uwsm.deleteMyBookWord(wordSetOrder,email,wordId);
    }
}
