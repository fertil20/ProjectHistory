package com.filetest;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Read {
    public static void main(String[] args) {
        try {
            final FileReader fileReader = new FileReader("c:\\del\\file1.txt");
            /*int c;
            while ((c = fileReader.read()) > 0) {
                System.out.print(new Character((char) c));
            }
            fileReader.close();*/

        /*    final BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }*/

            final FileInputStream fis = new FileInputStream("c:\\del\\file1.txt");
            final ObjectInputStream ois = new ObjectInputStream(fis);

            final Configuration o = (Configuration) ois.readObject();
            System.out.println(o.getFilePath());

            ois.close();
            fis.close();


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
