package com.golivkin.banksystem.service;

import com.golivkin.banksystem.model.Account;
import com.golivkin.banksystem.model.Bill;

public class PaymentService {

    public void pay(Account account, int amount){

        Bill bill = account.getBill();
        if(bill.getAmount() < amount) {
            System.out.println("Операция невозможна, недостаточно средств!");
        } else {
            int currentBillAmount = bill.getAmount();
            System.out.println("Происходит операция платежа, текущее значение счета аккаунта "
                    + account.getAccountHolder().getName() + " : " + currentBillAmount);
            bill.setAmount(currentBillAmount - amount);
            System.out.println("Платеж завершен, новое значение счета " + bill.getAmount() + "\n");
        }
    }
}
