package com.mycompany.homework02;

import work01.Utilitor;
import work02.Person;
import work03.Account;

public class homework02 {

    public static void main(String[] args) {
        work01Utilitor();
        work02Person();
        work03Account();
    }

    static void work01Utilitor() {
        Utilitor utilitor = new Utilitor();
        try {
            String stringValue = utilitor.testString("Hello");
            System.out.println("testString : " + stringValue);
        } catch (NullPointerException | IllegalArgumentException e) {
            System.err.println("Error : " + e.getMessage());
        }

        try {
            double positiveValue = utilitor.testPositive(5.0);
            System.out.println("testPositive : " + positiveValue);
        } catch (IllegalArgumentException e) {
            System.err.println("Error : " + e.getMessage());
        }

        try {
            long isbn10 = 213856789L;
            long checkDigit = utilitor.computeIsbn10(isbn10);
            System.out.println("computeIsbn10 : " + checkDigit);
        } catch (IllegalArgumentException e) {
            System.err.println("Error : " + e.getMessage());
        }
    }

    static void work02Person() {
        Person person1 = new Person("John", "Doe");
        Person person2 = new Person("Joe", "Dane");

        System.out.println("Before modification:");
        System.out.println(person1);

        person1.setFirstname("Johhpy");
        person1.setLastname("Deppy");

        System.out.println("After modification:");
        System.out.println(person1);

        System.out.println("person1 = person2? " + person1.equals(person2));
    }

    static void work03Account() {
        Person person1 = new Person("Goget", "Lastname1");
        Person person2 = new Person("Ajob", "Lastname2");
        Account account1 = new Account(person1);
        Account account2 = new Account(person2);

        System.out.println("Account 1: " + account1);
        System.out.println("Account 2: " + account2);

        account1.deposit(500.0);
        System.out.println("Account 1 deposit: " + account1);

        account1.withdraw(200.0);
        System.out.println("Account 1 withdrawal: " + account1);
//Error I cant fix this please let me go T_T
        account1.transfer(200.0, account2);
        System.out.println("Account 1 transfer: " + account1);
        System.out.println("Account 2 transfer: " + account2);
        System.out.println("Are account1 and account2 equal? " + account1.equals(account2));
    }
}
