package com.company;

public class ParamTest2 {
    public static void main(String[] args){
        Lyt lyt = new Lyt();
        int a = 1;
        lyt.changeInt(a);
        System.out.println(a);
    }
}


class Lyt{
    void changeInt(int a){
        ++a;
    }
}