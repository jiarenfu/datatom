package com.company;

public class PolyTest2 {
    public static void main(String[] args){
        Area a = new Triangle(10,6);
        int ae = a.jsArea();
        System.out.println("Triangle:" + ae);

        Ladderangle ld = new Ladderangle(10,10,10);
        int ae2 = ld.jsArea();
        System.out.println("Ladderangle:" + ae2);
    }
}

abstract class Area{
    public abstract int jsArea();
}

class Triangle extends Area{
    int width;
    int height;

    public Triangle(int width,int height){
        this.width = width;
        this.height = height;
    }
    public int jsArea(){
        return (width * height) / 2;
    }
}

class Ladderangle extends Area{
    int width;
    int leng;
    int height;

    public Ladderangle(int width,int leng,int height){
        this.width = width;
        this.leng = leng;
        this.height = height;
    }

    public int jsArea(){
        return  ((width + leng) * height) / 2;
    }
}
