package www.george.com.Entity;

public class WordSetInfo {
    private int wordSet;
    private int learnWord;
    private int allWord;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWordSet(int wordSet) {
        this.wordSet = wordSet;
    }

    public void setAllWord(int allWord) {
        this.allWord = allWord;
    }

    public void setLearnWord(int learnWord) {
        this.learnWord = learnWord;
    }

    public int getWordSet() {
        return wordSet;
    }

    public int getAllWord() {
        return allWord;
    }

    public int getLearnWord() {
        return learnWord;
    }
}
