package com.example.file_sharing;

public class uploadPDF {


    public String name;
    public String url;

    public uploadPDF() {
    }

    public uploadPDF(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
