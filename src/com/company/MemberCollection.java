package com.company;

public class MemberCollection  {
    Member[] a;
    int capacity;
    int size() {

        return capacity;
    }
    
    Member get (int i) {
        if (i < 0 || i > (capacity-1)) throw new IndexOutOfBoundsException();
        return a[i];
    }
    
    Member set (int i, Member mem){
        if (i < 0 || i > (capacity - 1)) throw new IndexOutOfBoundsException();
        Member placeHold = a[i];
        a[i] = mem;
        return placeHold;
        
    }
    
    /** @noinspection SameParameterValue*/
    void add(int i, Member mem){
        if ( i < 0 || i > capacity) throw new IndexOutOfBoundsException();
        if (capacity == a.length) {
            resize();
        }
        for (int j = capacity; j > i; j --){
            a[j] = a[j-1];
        }
        a[i] = mem;
        capacity++;
    }

    Member remove(int i){
        if ( i < 0 || i > (capacity -1 )) throw new IndexOutOfBoundsException();
        Member query = a[i];
        for (int j = i; j < (capacity -1); j++){
            a[j] = a[j+1];
        }
        capacity --;
        if (a.length >= 2*capacity){
            resize();
        }
        return query;
    }

     void resize() {
        Member[] bigger = new Member[(Math.max(capacity*2, 1))];
        for (int i =0; i < capacity; i++){
            bigger[i] = a[i];
        }
        a = bigger;
    }

    public MemberCollection () {
       a = new Member[10];
    }
}
