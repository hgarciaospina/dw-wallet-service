package com.digitalwalletservice.domains.value_object;

public class CustomerPhoneNumber {

    public static final String validPhoneNumberRegex = "9[0-9]{8}";
    public final String value;

    public CustomerPhoneNumber(String value){
        this.value = value;
        this.ensureIsValidPhoneNumber(value);
    }
    private void ensureIsValidPhoneNumber(String value){
        if(!value.matches(this.validPhoneNumberRegex)){
            throw new RuntimeException("Phone number is invalid");
        }
    }
}