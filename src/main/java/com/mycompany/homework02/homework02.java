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
        Person person1 = new Person("John", "Gotnojob");
        Person person2 = new Person("Joe", "Gotajob");

        System.out.println("Before modification :");
        System.out.println(person1);

        person1.setFirstname("Johhpy");
        person1.setLastname("Isunhappy");

        System.out.println("After mod :");
        System.out.println(person1);

        System.out.println("Is person1 = person2 : " + person1.equals(person2));
    }

    static void work03Account() {
        Person person1 = new Person("Phiravit", "GogetAjob");
        Person person2 = new Person("Spong","Wet");
        Person person3 = new Person("Funky","Japanesegoblin");
        Account account1 = new Account(person1);
        Account account2 = new Account(person2);
        Account account3 = new Account(person3);

        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);

        System.out.println(account1.getNo());
        System.out.println(account1.getBalance());
        System.out.println(account1.getOwner());

        account1.deposit(2564);
        System.out.println(account1);

        account1.transfer(1231,account3);
        System.out.println(account1);
        System.out.println(account3);

        System.out.println(account1.equals(account2));
    }
}
