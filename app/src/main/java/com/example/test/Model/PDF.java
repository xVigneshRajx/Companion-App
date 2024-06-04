package com.example.test.Model;

import java.io.InputStream;

public class PDF {

    public String name;
    public String url;
    public Object fromStream;

    public PDF(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public System fromStream(InputStream inputStream) {
        return null;
    }
}


