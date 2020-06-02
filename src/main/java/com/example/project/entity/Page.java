package com.example.project.entity;

public class Page {

    private String current;

    private String total;

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    @Override
    public String toString() {
        return "Page{" +
                "current='" + current + '\'' +
                ", total='" + total + '\'' +
                '}';
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
