package com.learn.threads;

public class ThreadUsage {
    public static void main(String[] args) {
        var start = System.currentTimeMillis();

        for (int i = 0; i < 10; i++){
            int finalI = i;
            new Thread(() -> {
                int runCounter = 0;
                while(System.currentTimeMillis() - start < 10000){
                    //do nothing
                    runCounter++;
                }
                System.out.println("wait " + finalI + " finished, ran " + runCounter + " times ");
            }).start();
        }
    }
}
