package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<E extends Fruit>{
    ArrayList<E> box;

    public Box(ArrayList<E> box){
        this.box = box;
    }

    public Box(E... fruits) {
        this.box = new ArrayList<>(Arrays.asList(fruits));
    }

    public double getWeight(){
        double sum = 0.0;
        for (E e : box) {
            sum += e.getWeight();
        }
        return sum;
    }

    public boolean compare(Box<?> box){
        return Math.abs(this.getWeight() - box.getWeight()) < 0.0001;
    }

    public void add(E fruit){
        box.add(fruit);
    }

    public void remove(E fruit){
        box.remove(fruit);
    }

    public void pour(Box<E> another){
        another.box.addAll(box);
        box.clear();
    }
}
