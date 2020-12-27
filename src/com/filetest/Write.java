package com.filetest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Write {
    public static void main(String[] args) {
        try {
          /*  final FileWriter writer = new FileWriter("c:\\del\\file1.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("123\n");
            bufferedWriter.flush();
            bufferedWriter.write("123\n");
            bufferedWriter.write("123\n");
            bufferedWriter.close();*/


            Configuration conf = new Configuration();
            conf.setFilePath("c:\\del");

            FileOutputStream fos = new FileOutputStream("c:\\\\del\\\\file1.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(conf);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
