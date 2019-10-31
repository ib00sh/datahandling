package com.epam.datahandling;

import com.epam.datahandling.lexis.Text;
import com.epam.datahandling.utils.BackupUtils;

import java.io.File;
import java.util.Arrays;

/**
 * Demo class demonstrating program capabilities of working with files, text parsing and displaying reports
 */
public class Runner {

    public static void main(String[] args)  {
//        BackupUtils backupUtils = new BackupUtils();
//        backupUtils.backup(src,dest);

        File src = new File("src/main/resources/original/book.txt");

        TextProcessor textProcessor = new TextProcessor();
        Text text = textProcessor.parse(src);


        EntityParser.parseText(text);
        Arrays.asList(text.getSentences())
                .forEach(sentence -> EntityParser.parseSentence(sentence));

        Arrays.asList(text.getSentences()).forEach(sentence -> {
            try {
                Arrays.asList(sentence.getWords())
                        .forEach(word -> System.out.print(" "+ word.getContent()));
                System.out.println();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

}
