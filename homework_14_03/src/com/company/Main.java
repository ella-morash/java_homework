package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Implement a simple bank app
        a. Create Person class with the following attributes (String firstName, String lastName). Write constructor, toString and getters methods.
        b. Create Account class with the following attributes String IBAN, Person client, double balance. Write constructor, toString and getters methods.
        c. Create BankProcessing class with an attribute Account[] bankAccounts. Write a constructor, which takes an array of Accounts as argument.
         Write toString method. Write the method witch return the array of all of the bank clients.
        d. In the Account class write secureToString method which works like normal toString but instead IBAN put
        in the result string something like DE45 *********35 (replaces all characters of IBAN string to char
        ‘’ except four first and two last characters).
        e. In the BankProcessing implement the secureToString method which displays the accounts using Account.
        secureToString method.
        f. In the BankProcessing implement the method which returns the sum of all accounts balances.*/
        Person person1 = new Person("Miles","Devis");
        Person person2 = new Person("Olga","Breiniger");
        Person person3 = new Person("Ivan","Ivanov");
        Account account1 = new Account("DE45 90989098035",person1,1500);
        Account account2 = new Account("DE45 90989098087",person2,1900);
        Account account3 = new Account("DE45 90989098090",person3,1400);

        System.out.println(account1.secureToString());
        BankProcessing newProcess = new BankProcessing(new Account[]{account1,account2,account3});
        newProcess.secureToString();
        System.out.println(newProcess.sum());
    }
}
