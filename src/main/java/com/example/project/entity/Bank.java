package com.example.project.entity;

public class Bank {

    private String acc;

    private String name;

    private String bsb;

    @Override
    public String toString() {
        return "Bank{" +
                "acc='" + acc + '\'' +
                ", name='" + name + '\'' +
                ", bsb='" + bsb + '\'' +
                '}';
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBsb() {
        return bsb;
    }

    public void setBsb(String bsb) {
        this.bsb = bsb;
    }
}
