package com.yjxxt.bean;

public class Phone {
    private String num;

    public Phone() {
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "num='" + num + '\'' +
                '}';
    }
}
