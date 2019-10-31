package com.epam.datahandling;

import com.epam.datahandling.lexis.Sentence;
import com.epam.datahandling.lexis.Text;
import com.epam.datahandling.lexis.Word;
import com.epam.datahandling.utils.ViewText;

import java.io.*;
import java.util.Arrays;

/**
 * Demo class demonstrating program capabilities of working with files, text parsing and displaying reports
 */
public class Runner {

    public static void main(String[] args)  throws IOException {
       String addresOriginalFile = "src/main/resources/original/book.txt";
       String addresBackupFile = "src/main/resources/original/book.txt";

        File src = new File(addresOriginalFile);

        TextProcessor textProcessor = new TextProcessor();
        Text text = textProcessor.parse(src);

        ViewText viewText = new ViewText();
        viewText.showText(text);

   //     BackupUtils.backup(addresOriginalFile,addresBackupFile);



    }

}
