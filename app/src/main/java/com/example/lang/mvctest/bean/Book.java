package com.example.lang.mvctest.bean;

/**
 * Created by lang on 2017/8/30.
 */

public class Book {
    //书名
    private String name;
    //书的图片
    private int image;

    public Book(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
