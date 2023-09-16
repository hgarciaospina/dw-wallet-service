package com.digitalwalletservice.domains.value_object;

public class CustomerFirstName {
    public static final String validFirstNameRegex = "^(?!\\s+$)^(?!\\d+$)[\\w\\s.#]+$";
    public final String value;

    public CustomerFirstName(String value) {
        this.value = value;
        this.ensureIsValidFirstName(value);
    }

    private void ensureIsValidFirstName(String value){
        if(!value.matches(this.validFirstNameRegex)){
            throw new RuntimeException("First name is invalid");
        }
    }
}