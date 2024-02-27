package org.example.Model;

import java.security.SecureRandom;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String passWord;
    private String departMent;
    private int  mailboxCapacity;
    private String alternateEmail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
//        this.departMent = setDepartment();
        createrandomPassword();
    }

    private String setDepartment() {
        System.out.println("Typer your department:\n1.Accounting\n2.Sales\n3.Dev\n4.None");
        Integer sc = new Scanner(System.in).nextInt();
        switch (sc) {
            case 1:
                System.out.println("Accounting");
                break;
            case 2:
                System.out.println("Sales");
                break;
            case 3:
                System.out.println("Dev");
                break;
            case 4:
                System.out.println("None");
                break;
        }
        return null;
    }
    private String createrandomPassword(){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder(6);
        for (int i = 0; i < 6; i++) {
            password.append(characters.charAt(random.nextInt(characters.length())));
        }
        System.out.println("Password: " + password);
        return new String(password);
    }
}
