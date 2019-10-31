package com.epam.datahandling.lexis;

/**
 * Word is a sequence of characters separated by spaces and punctuation
 */
public class Word {

    private String content;

    public Word(String word)
    {
        this.content = word;
    }

    public String getContent() {
        return content;
    }
}
