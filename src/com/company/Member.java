package com.company;

import java.util.ArrayList;

public class Member {
    String firstName;
    String lastName;
    String address;
    int phone;
    ArrayList<Movie> borrowed;
    int pword;

    public Member(String first, String last, String addr, int number,int password){
        this.firstName = first;
        this.lastName = last;
        this.address = addr;
        this.phone = number;
        this.pword = password;
        this.borrowed =new ArrayList<Movie>();
    }





}
