package com.learn.inheritance;

public class Mango extends Fruit{
    boolean ripe;

    public boolean isLarge()
    {
        return  getSize() > 5;
    }
}
