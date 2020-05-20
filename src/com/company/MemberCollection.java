package com.company;

public class MemberCollection {
    Member[] members;
    int capacity = 10;
    int counter;

    public MemberCollection(){
        members = new Member[capacity];
        counter = 0;

    }

    public void addMember(Member mem){

        if (counter < 10){

            members[counter] = mem;
            counter++;


        }
    }

    public Member getMemberByPin(int pin){
        for (int i=0; i < members.length; i++){
            if(pin == members[i].pword ){
                return members[i];
            }

        }return null;


    }

}
