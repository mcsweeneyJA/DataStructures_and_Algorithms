package com.company;

public class Member {
    String firstName;
    String lastName;
    String address;
    int phone;
    String borrowed;
    int pword;

    public Member(String first, String last, String addr, int number,int password, String rented){
        firstName = first;
        lastName = last;
        address = addr;
        phone = number;
        pword = password;
        borrowed = rented;
    }
}
