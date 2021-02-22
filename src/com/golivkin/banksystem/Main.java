package com.golivkin.banksystem;

import com.golivkin.banksystem.model.Account;
import com.golivkin.banksystem.model.Bill;
import com.golivkin.banksystem.model.Person;
import com.golivkin.banksystem.service.DepositService;
import com.golivkin.banksystem.service.PaymentService;
import com.golivkin.banksystem.service.TransferService;

public class Main {

    public static void main(String[] args) {

        Person alexPerson = new Person("Alex", "+7(928)765-87-33", "Petrov");
        Bill alexBill = new Bill(20000);
        Account alexAccount = new Account(alexPerson, alexBill);

        Person maxPerson = new Person("Max", "+7(988)765-87-33", "Ivanov");
        Bill maxBill = new Bill(30000);
        Account maxAccount = new Account(maxPerson, maxBill);

        PaymentService paymentService = new PaymentService();
        paymentService.pay(alexAccount, 5000);
        paymentService.pay(maxAccount, 8000);

        DepositService depositService = new DepositService();
        depositService.deposit(alexAccount, 2000);
        depositService.deposit(maxAccount, 4000);

        System.out.println();
        TransferService transferService = new TransferService();
        transferService.transfer(alexAccount, maxAccount, 3000);

    }
}
