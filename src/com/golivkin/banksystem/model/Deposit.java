package com.golivkin.banksystem.model;

public class Deposit {

    private Bill bill;

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Deposit(Bill bill) {
        this.bill = bill;
    }
}
