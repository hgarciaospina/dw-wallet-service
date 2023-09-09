package com.digitalwalletservice.domains.value_object;

public class CustomerTypeDocument {

    public static final String validTypeDocumentRegex = "^(DNI|RUC)$";
    public String value;
    public CustomerTypeDocument(String value){
        this.value = value;
        this.ensureIsValidTypeDocument(value);
    }

    private void ensureIsValidTypeDocument(String value){
        if(!value.matches(this.validTypeDocumentRegex)){
            throw new RuntimeException("Type document is invalid");
        }
    }
}
