package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Integer[] arr = new Integer[5];
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//        TestGenerics<Integer> test = new TestGenerics<>(arr);
//        test.changeElements(arr,3,2);
//        test.toArrayList(arr);
        ArrayList<Apple> apples = new ArrayList<>();
        ArrayList<Orange> oranges = new ArrayList<>();
        for(int i = 0; i < 6; i++){
            Apple apple = new Apple();
            apples.add(apple);
        }
        for(int i = 0; i < 4; i++){
            Orange orange = new Orange();
            oranges.add(orange);
        }
        Box<Apple> appleBox = new Box<Apple>(apples);
        Box<Orange> orangeBox = new Box<Orange>(oranges);
        System.out.println("Apple box weight: "+appleBox.getWeight());
        System.out.println("Orange box weight: "+orangeBox.getWeight());
        System.out.println("Is ABW equals OBW: " + appleBox.compare(orangeBox));
    }
}
