package com.zosh.model;

import jakarta.persistence.Column;

public class PaymentInformation {

    @Column(name ="cardholderName")
    private String cardHolderName;

    @Column(name ="card_number")
    private String cardNumber;

    @Column(name ="expiration_date")
    private String expirtationDate;

    @Column(name ="cvv")
    private String cvv;

}
