package com.mycompany.homework02;

import work01.Utilitor;
import work02.Person;

public class homework02 {

    public static void main(String[] args) {
        work01Utilitor();
       work02Person();
//       work03Account();
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
            long isbn10 = 999999999L;
            long checkDigit = utilitor.computeIsbn10(isbn10);
            System.out.println("computeIsbn10 : " + checkDigit);
        } catch (IllegalArgumentException e) {
            System.err.println("Error : " + e.getMessage());
        }
    }

    static void work02Person() {
        Person person1 = new Person("Who", "Joe?");
        System.out.println("ID: " + person1.getId());
        System.out.println("Firstname: " + person1.getFirstname());
        System.out.println("Lastname: " + person1.getLastname());
        System.out.println("Person1 details: " + person1);
        Person person2 = new Person("Hah", "Gotchu!");
        System.out.println("Person1 == Person2: " + person1.equals(person2));
        person1.setFirstname("Joe");
        person1.setLastname("Mama");
        System.out.println("Updated: " + person1);
    }

    static void work03Account() {
        /*
       3.1 Create a public class named "Account" in package named "work03".
           This class contains the following fields and methods.
       3.2 a private static field of type "long" named "nextNo"
           initialized to 100_000_000.
       3.3 a private final "no" field of type "long".
       3.4 a private "owner" field of type "Person".
       3.5 a private "balance" field of type "double".
       3.6 a public constructor that receives an "owner" parameter of
           type "Person" to set the "owner" field. This method throws
           NullPointerException if the "owner" parameter is null.
           This method sets the value of "balance" to 0.0 and sets 
           the value of "no" field as follows. 
           1) Let result = Utilitor.computeIsbn10(nextNo).
           2) If result is 10, increment the value of "nextNo" by 1 
              and try Step 1) again until the result is not 10. 
           3) Set the value of "no" filed to be 10 * nextNo + the result.
           4) Increment the value of "nextNo" by 1.
       3.7 public getters for "no", "owner", and "balance".
       3.8 a public method named "deposit" that receives a "double" parameter
           named "amount". This method throws IllegalArgumentException
           if "amount" cannot pass "Utilitor.testPositive" method.
           Otherwise, the method adds the "amount" to "balance"
           and then returns the new "balance".
       3.9 a public method named "withdraw" that receives a "double" parameter
           named "amount". This method throws IllegalArgumentException
           if "amount" does not pass "Utilitor.testPositive" method.
           Otherwise, the method subtracts the "amount" from "balance"
           and then returns the new "balance".  However, this method will not
           do so if the new "balance" cannot pass "Utilitor.testPositive" method.
       3.10 a public method named "transfer" that recieves a "double" parameter
            named "amount" and an "Account" parameter named "account".
            This method throws IllegalArgumentException if "account" is null
            or it cannot "withdraw" the "amount" from this object. Otherwise,
            this method "withdraw" the "amount" from this object and "deposit"
            the "amount" to the "account" object.  This method returns nothing.
       3.11 @Override a public "toString" method that returns
            "Account(no,balance)" where "no" and "balance" are
            the "no" and "balance" fields of this object.
       3.12 @Override a public "equals" method that returns true
            if this object is the same as the object in the parameter
            (i.e., the same reference). Otherwise, it returns false.
       3.13 Show in this "work03Account" method how to
            use 3.6-3.12 and check their correctness. */
    }
}
