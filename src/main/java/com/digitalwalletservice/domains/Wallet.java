package com.digitalwalletservice.domains;

import com.digitalwalletservice.domains.value_object.WalletBalance;
import com.digitalwalletservice.domains.value_object.WalletCurrency;

import java.math.BigDecimal;

public class Wallet {
    private Customer customer;
    private WalletBalance balance;
    private WalletCurrency currency;
    public Wallet(Customer customer, BigDecimal balance, String currency){
        this.customer = customer;
        this.balance = new WalletBalance(balance);
        this.currency = new WalletCurrency(currency);
    }
    private BigDecimal getBalance(){
        return this.balance.value;
    }
}