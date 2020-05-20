package com.company;

import java.lang.management.MemoryManagerMXBean;
import java.util.Arrays;

public class MemberCollectionOG {
    Member[] values;

    public MemberCollectionOG() {
        values = new Member[1];


    }


    public  void mergeSort(Member[] a, int from, int to) {
        if (from == to) {
            return;
        }
        int mid = (from + to) / 2;
        // sort the first and the second half
        mergeSort(a, from, mid);
        mergeSort(a, mid + 1, to);
        merge(a, from, mid, to);
    }// end mergeSort
//work

    public void merge(Member[] a, int from, int mid, int to) {
        int n = to - from + 1;       // size of the range to be merged
        Member[] b = new Member[n];   // merge both halves into a temporary array b
        int i1 = from;               // next element to consider in the first range
        int i2 = mid + 1;            // next element to consider in the second range
        int j = 0;                   // next open position in b

        // as long as neither i1 nor i2 past the end, move the smaller into b
        while (i1 <= mid && i2 <= to) {
            if (a[i1].lastName.compareTo(a[i2].lastName) < 0) {
                b[j] = a[i1];
                i1++;
            } else {
                b[j] = a[i2];
                i2++;
            }
            j++;
        }

        // note that only one of the two while loops below is executed
        // copy any remaining entries of the first half
        while (i1 <= mid) {
            b[j] = a[i1];
            i1++;
            j++;
        }

        // copy any remaining entries of the second half
        while (i2 <= to) {
            b[j] = a[i2];
            i2++;
            j++;
        }

        // copy back from the temporary array
        for (j = 0; j < n; j++) {
            a[from + j] = b[j];
        }
    }//end merge





    int capacity;

    int size() {

        return capacity;
    }

    Member get(int i) {
        if (i < 0 || i > (capacity - 1)) throw new IndexOutOfBoundsException();
        return values[i];
    }

    Member set(int i, Member mem) {
        if (i < 0 || i > (capacity - 1)) throw new IndexOutOfBoundsException();
        Member placeHold = values[i];
        values[i] = mem;
        return placeHold;

    }


    void add(int i, Member mem) {
        if (i < 0 || i > capacity) throw new IndexOutOfBoundsException();
        if (capacity == values.length) {
            resize();
        }
        for (int j = capacity; j > i; j--) {
            values[j] = values[j - 1];
        }
        values[i] = mem;
        capacity++;
    }

    Member remove(int i) {
        if (i < 0 || i > (capacity - 1)) throw new IndexOutOfBoundsException();
        Member query = values[i];
        for (int j = i; j < (capacity - 1); j++) {
            values[j] = values[j + 1];
        }
        capacity--;
        if (values.length >= 2 * capacity) {
            resize();
        }
        return query;
    }

    void resize() {
        Member[] bigger = new Member[(Math.max(capacity * 2, 1))];
        for (int i = 0; i < capacity; i++) {
            bigger[i] = values[i];
        }
        values = bigger;
    }

    public Member getMemberByPin(int pin){
        for (int i=0; i < values.length; i++){
            if(pin == values[i].pword ){
                return values[i];
            }

        }return null;


    }



}
