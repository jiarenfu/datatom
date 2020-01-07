package com.company;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Main {

    public void method(int a){
        System.out.println(a++);
    }

    public static void main(String[] args) {
        Main M = new Main();
        M.method(3212);
    }
}
