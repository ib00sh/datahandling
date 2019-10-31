package com.epam.datahandling;

import com.epam.datahandling.lexis.Text;
import java.io.*;
import java.util.Scanner;


public class TextProcessor {

    public Text parse(File src) {
        String stringOfText = "";
        Scanner in = null;
        try {
            in = new Scanner(src);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (in.hasNext())
            stringOfText += in.nextLine() + "\r\n";
        in.close();
        Text text = new Text(stringOfText);
        text.getSentences();

        return text;
    }




}