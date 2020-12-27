package com.filetest;

import com.thoughtworks.xstream.XStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class X {
    public static void main(String[] args) {

        Configuration conf = new Configuration();
        conf.setFilePath("c:\\del");

        final XStream xStream = new XStream();
        xStream.alias("Configuration", Configuration.class);

        try {
            xStream.toXML(conf, new FileWriter("c:\\del\\file1.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            final Configuration configuration = (Configuration) xStream.fromXML(new FileReader("c:\\del\\file1.txt"));
            System.out.println(configuration.getFilePath());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
