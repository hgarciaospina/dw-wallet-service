package com.digitalwalletservice.domains.value_object;

public class CustomerLastName {
    public static final String validLastNameRegex = "^(?!\\s+$)^(?!\\d+$)[\\w\\s.#]+$";
    public final String value;

    public CustomerLastName(String value) {
        this.value = value;
        this.ensureIsValidLastName(value);
    }

    private void ensureIsValidLastName(String value){
        if(!value.matches(this.validLastNameRegex)){
            throw new RuntimeException("Last name is invalid");
        }
    }
}