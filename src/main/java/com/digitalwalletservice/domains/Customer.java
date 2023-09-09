package com.digitalwalletservice.domains;

import com.digitalwalletservice.domains.value_object.*;
public class Customer {
    private final CustomerFirstName firstName;
    private final CustomerLastName lastName;
    private final CustomerDocumentNumber documentNumber;
    private final CustomerTypeDocument typeDocument;
    private CustomerPhoneNumber phoneNumber;
    private final CustomerEmail email;

    public Customer(String firstName, String lastName, String documentNumber,  String typeDocument, String phoneNumber, String email){
        this.firstName = new CustomerFirstName(firstName);
        this.lastName = new CustomerLastName(lastName);
        this.documentNumber = new CustomerDocumentNumber(documentNumber);
        this.typeDocument = new CustomerTypeDocument(typeDocument);
        this.phoneNumber = new CustomerPhoneNumber(phoneNumber);
        this.email = new CustomerEmail(email);
    }
    private void updatePhoneNumber(String phoneNumber){
        this.phoneNumber = new CustomerPhoneNumber(phoneNumber);
    }
    public String getDocumentNumber(){
        return this.documentNumber.value;
    }
}