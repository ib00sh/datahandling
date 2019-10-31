package com.epam.datahandling.utils;

import com.epam.datahandling.EntityParser;
import com.epam.datahandling.lexis.Text;
import com.epam.datahandling.lexis.Word;

import java.util.Arrays;


public class ViewText {
    private int countSentce;

    public  void showText (Text text){
        System.out.println();
        System.out.println();
        System.out.format(" |%-4s|%-30s|%-13s|", " № ", "Sentence", "Word's Count");
        System.out.println();
        printFrame();
        System.out.println();

        EntityParser.parseText(text);
        Arrays.asList(text.getSentences()).forEach(EntityParser::parseSentence);

        text.sortByLength();

        Arrays.asList(text.getSentences()).forEach(sentence -> {
            countSentce++;
                System.out.format(" |%-4d|%-30s|%-13s|" ,countSentce, sentence.getContent().substring(0,10) , sentence.getWords().length);
                System.out.println();

        });


        printFrame();
    }


    static void printFrame (){
        System.out.print(" |");
        for (int i = 0; i < 49; i++) {
            System.out.print("=");
        }
        System.out.print("|");
    }

}
