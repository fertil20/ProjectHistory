package com.filetest;

import java.io.Serializable;

public class Configuration implements Serializable {
    private String filePath;

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
