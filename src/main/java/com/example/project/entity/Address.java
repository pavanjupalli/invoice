package com.example.project.entity;

public class Address {

    private Invoice invoice;

    private Page page;

    private Bank bank;

    private Details details;

    private From from;

    private To to;

    private Total total;

    private String remark;

    private String note;

    @Override
    public String toString() {
        return "Address{" +
                "invoice=" + invoice +
                ", page=" + page +
                ", bank=" + bank +
                ", details=" + details +
                ", from=" + from +
                ", to=" + to +
                ", total=" + total +
                ", remark='" + remark + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

    public Address(Invoice invoice, Page page, Bank bank, Details details, From from, To to, Total total) {
        this.invoice = invoice;
        this.page = page;
        this.bank = bank;
        this.details = details;
        this.from = from;
        this.to = to;
        this.total = total;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    public From getFrom() {
        return from;
    }

    public void setFrom(From from) {
        this.from = from;
    }

    public To getTo() {
        return to;
    }

    public void setTo(To to) {
        this.to = to;
    }

    public Total getTotal() {
        return total;
    }

    public void setTotal(Total total) {
        this.total = total;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
