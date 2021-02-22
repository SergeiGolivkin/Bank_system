package com.golivkin.banksystem.service;

import com.golivkin.banksystem.model.Account;
import com.golivkin.banksystem.model.Bill;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class DepositService {

    public void deposit(Account account, int amount) {

        Bill bill = account.getBill();
        int currentBillAmount = bill.getAmount();
        System.out.println("Операция пополнения счета аккаунта " + account.getAccountHolder().getName() + " : "
                + currentBillAmount);
        bill.setAmount(currentBillAmount + amount);
        System.out.println("Пополнение счета прошло успешно, новое значение счета аккаунта "
                + account.getAccountHolder().getName() + " : " + bill.getAmount() + "\n");

    }
}
