package com.epam.datahandling.utils;

import com.epam.datahandling.EntityParser;
import com.epam.datahandling.lexis.Text;

import java.util.Arrays;

public class ViewText {
    public  void showText (Text text){
        EntityParser.parseText(text);
        Arrays.asList(text.getSentences())
                .forEach(sentence -> EntityParser.parseSentence(sentence));

        Arrays.asList(text.getSentences()).forEach(sentence -> {
            try {
                Arrays.asList(sentence.getWords())
                        .forEach(word -> System.out.print(word.getContent() + " "));
                System.out.println();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

    }
}
