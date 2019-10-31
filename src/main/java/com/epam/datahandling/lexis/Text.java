package com.epam.datahandling.lexis;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Text to be parsed
 */
public class Text {
    private static Comparator<Sentence> comp  = Comparator.comparingInt(o -> o.getContent().length());
    private String content;
    private Sentence[] sentences;


    public Text(String content)
    {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public Sentence[] getSentences() {
        return sentences;
    }

    public void setSentences(Sentence[] sentences){
        this.sentences = sentences;
    }

    public void sortByLength(){
        Arrays.sort(sentences, comp);
    }

}
