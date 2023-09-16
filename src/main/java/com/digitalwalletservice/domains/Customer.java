package com.digitalwalletservice.domains;

import com.digitalwalletservice.domains.value_object.*;
public class Customer {
    private final CustomerFirstName firstName;
    private final CustomerLastName lastName;
    private final CustomerDocumentNumber documentNumber;
    private final CustomerDocumentType documentType;
    private CustomerPhoneNumber phoneNumber;
    private final CustomerEmail email;

    public Customer(String firstName, String lastName, String documentNumber,
                    String documentType, String phoneNumber, String email){
        this.firstName = new CustomerFirstName(firstName);
        this.lastName = new CustomerLastName(lastName);
        this.documentNumber = new CustomerDocumentNumber(documentNumber);
        this.documentType = new CustomerDocumentType(documentType);
        this.phoneNumber = new CustomerPhoneNumber(phoneNumber);
        this.email = new CustomerEmail(email);
    }

    public String getFirstName() {
        return firstName.value;
    }

    public String getLastName() {
        return lastName.value;
    }

    public String getDocumentNumber() {
        return documentNumber.value;
    }

    private String getDocumentType(){
        return this.documentType.value;
    }
    private String getPhoneNumber(){
        return this.phoneNumber.value;
    }
    private String getEmail(){
        return this.email.value;
    }
    private void updatePhoneNumber(String phoneNumber){
        this.phoneNumber = new CustomerPhoneNumber(phoneNumber);
    }

}