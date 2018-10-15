package www.george.com.Entity;

import www.george.com.dao.WordSet;

import java.util.List;

public class WordInfo {
    private WordSet ws;
    private  int order;

    private List<WordSet> randomWord;
    private int num;


    public void setNum(int num) {
        this.num = num;
    }

    public int getOrder() {
        return order;
    }

    public WordSet getWs() {
        return ws;
    }

    public List<WordSet> getRandomWord() {
        return randomWord;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public void setWs(WordSet ws) {
        this.ws = ws;
    }

    public void setRandomWord(List<WordSet> randomWord) {
        this.randomWord = randomWord;
    }

    public int getNum() {
        return num;
    }
}
