package com.example.dashboardui;

public class List_data {

    private String title;
    private String price;
    private String quntity;
    private int imgId;


    public List_data(String title, String price, String quntity, int imgId) {
        this.title = title;
        this.price = price;
        this.quntity = quntity;
        this.imgId = imgId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuntity() {
        return quntity;
    }

    public void setQuntity(String quntity) {
        this.quntity = quntity;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
