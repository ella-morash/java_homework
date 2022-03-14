package com.company;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Account {
    private String IBAN;
    private Person client;
    private double balance;

    public Account(String IBAN, Person client, double balance) {
        this.IBAN = IBAN;
        this.client = client;
        this.balance = balance;
    }

    public String secureToString() {

        return this.IBAN.substring(0,5) + "*********" +
                this.IBAN.substring(this.IBAN.length()-2,this.IBAN.length());
    }
}