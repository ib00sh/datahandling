package com.epam.datahandling.lexis;

/**
 * Text to be parsed
 */
public class Text {

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


}
