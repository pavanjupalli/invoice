package com.example.project.entity;

public class Invoice {

    private String invoiceNumber;

    private String orderNumber;

    private String invoiceDate;

    private String dueDate;

    private String totalDue;

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceNumber='" + invoiceNumber + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                ", invoiceDate='" + invoiceDate + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", totalDue='" + totalDue + '\'' +
                '}';
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getTotalDue() {
        return totalDue;
    }

    public void setTotalDue(String totalDue) {
        this.totalDue = totalDue;
    }
}
