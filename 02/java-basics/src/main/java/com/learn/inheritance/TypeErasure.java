package com.learn.inheritance;

import java.util.ArrayList;
import java.util.List;

public class TypeErasure {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("item 1");

//    ArrayList<Object> list2 = list;
//    not possible because or generics are in variant.

        Object x = "asd";
        System.out.println(x);
        x = 10;
        System.out.println(x);

        ArrayList<Object> objList = new ArrayList<>();
        objList.add("asd");
        objList.add(10);
        objList.add(new Mango());

        objList.forEach(System.out::println);

        List<Fruit> fruitBasket = new ArrayList<>();
        fruitBasket.add(new Mango());
        fruitBasket.add(new Mango());

        List<Mango> mangoDozen = new ArrayList<Mango>(12);
        fruitBasket.addAll(mangoDozen);

        fruitBasket.forEach(System.out::println);
    }
}
