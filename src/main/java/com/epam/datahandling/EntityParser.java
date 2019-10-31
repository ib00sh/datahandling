package com.epam.datahandling;

import com.epam.datahandling.lexis.Sentence;
import com.epam.datahandling.lexis.Text;
import com.epam.datahandling.lexis.Word;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EntityParser {
    public static void parseText(Text text){
        Sentence[] result = new Sentence[]{};
        Matcher matcher = Pattern.compile("([a-zA-Z\\\\s]+[^.!?]*)").matcher(text.getContent());
        while (matcher.find()) {
            result = append(result, new Sentence(matcher.group(1)));
        }
        text.setSentences(result);
    }

    public static void parseSentence(Sentence sentence){
        Word[] result = new Word[]{};
        Matcher matcher = Pattern.compile("([a-zA-Z^0-9]+)").matcher(sentence.getContent());
        while (matcher.find()) {
            result = append(result, new Word(matcher.group(1).replaceAll("([0-9]+)","")));
        }
        sentence.setWords(result);
    }

    static <T> T[] append(T[] arr, T element) {
        final int N = arr.length;
        arr = Arrays.copyOf(arr, N + 1);
        arr[N] = element;
        return arr;
    }


}
