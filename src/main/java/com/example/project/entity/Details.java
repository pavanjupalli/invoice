package com.example.project.entity;

public class Details {

    private String hrsPerQty;

    private String service;

    private String ratePerPrice;

    private String adjust;

    private String subtotal;

    @Override
    public String toString() {
        return "Details{" +
                "hrsPerQty='" + hrsPerQty + '\'' +
                ", service='" + service + '\'' +
                ", ratePerPrice='" + ratePerPrice + '\'' +
                ", adjust='" + adjust + '\'' +
                ", subtotal='" + subtotal + '\'' +
                '}';
    }

    public String getHrsPerQty() {
        return hrsPerQty;
    }

    public void setHrsPerQty(String hrsPerQty) {
        this.hrsPerQty = hrsPerQty;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getRatePerPrice() {
        return ratePerPrice;
    }

    public void setRatePerPrice(String ratePerPrice) {
        this.ratePerPrice = ratePerPrice;
    }

    public String getAdjust() {
        return adjust;
    }

    public void setAdjust(String adjust) {
        this.adjust = adjust;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }
}
