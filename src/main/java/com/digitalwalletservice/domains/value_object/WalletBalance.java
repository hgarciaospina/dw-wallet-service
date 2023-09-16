package com.digitalwalletservice.domains.value_object;

import java.math.BigDecimal;

public class WalletBalance {
    public final BigDecimal value;
    public WalletBalance(BigDecimal value){
        this.value = value;
        this.ensureIsBalancePositiveValue(value);
    }
    private void ensureIsBalancePositiveValue(BigDecimal value){
        if(value.compareTo(BigDecimal.ZERO) < 0)
            throw new RuntimeException("The balance must be greater than zero");
    }
}