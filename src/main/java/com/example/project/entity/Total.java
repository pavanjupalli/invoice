package com.example.project.entity;

public class Total {

    private String subtotal;

    private String tax;

    private String total;

    @Override
    public String toString() {
        return "Total{" +
                "subtotal='" + subtotal + '\'' +
                ", tax='" + tax + '\'' +
                ", total='" + total + '\'' +
                '}';
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
