package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class TestGenerics<E> {
    private E[] arr;

    public TestGenerics (E[] arr){
        this.arr = arr;
    }

    public E[] changeElements(E[] arr, int index_1, int index_2){
        if(index_1 < 0 || index_1 >= arr.length || index_2 < 0 || index_2 >= arr.length){
            throw new IndexOutOfBoundsException("Indexes are not valid!");
        }else {
            E t = arr[index_1];
            arr[index_1] = arr[index_2];
            arr[index_2] = t;
        }
        System.out.println(Arrays.asList(arr));
        return arr;
    }
    
    public ArrayList<E> toArrayList(E[] arr){
        ArrayList<E> arrayList = new ArrayList<>();
        for (E e : arr) {
            arrayList.add(e);
        }
        System.out.println(arrayList);
        return arrayList;
    }
}
