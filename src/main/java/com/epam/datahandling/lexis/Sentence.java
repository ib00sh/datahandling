package com.epam.datahandling.lexis;


/**
 * Sentence is a sequence of characters separated by ".", "!", "?" and new line characters
 */
public class Sentence {

    private String content;
    private Word[] words;


    public Sentence(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }


    public Word[] getWords() {
        return words;
    }
    public void setWords(Word[] words){
        this.words = words;
    }
}
