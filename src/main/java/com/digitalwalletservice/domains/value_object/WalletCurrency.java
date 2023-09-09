package com.digitalwalletservice.domains.value_object;

public class WalletCurrency {
    public static final String validWalletCurrencyRegex = "^(PEN)$";
    public String value;
    public WalletCurrency(String value){
        this.value = value;
        this.ensureIsValidWalletCurrency(value);
    }

    private void ensureIsValidWalletCurrency(String value){
        if(!value.matches(this.validWalletCurrencyRegex)){
            throw new RuntimeException("Currency is invalid");
        }
    }
}
