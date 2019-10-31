package com.epam.datahandling.utils;

import java.io.*;
public class BackupUtils {

    /**
     * Backup file. Create backup file if it is not exists. Override existing backup.
     * @param src Path to the source file
     * @param dest Path to backup file
     * @throws IOException If source file is not exist
     */
    public static void backup(String src, String dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(src);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }
}
