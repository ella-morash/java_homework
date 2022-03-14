package com.company;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BankProcessing {
    private Account[] bankAccounts;

    public BankProcessing(Account[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public void secureToString(){
        for (Account account:this.bankAccounts) {
            System.out.println(account.secureToString());

        }
    }

    public int sum(){
        int sum = 0;
        for (Account account:this.bankAccounts){
            sum+=account.getBalance();
        }
        return sum;

    }
}
