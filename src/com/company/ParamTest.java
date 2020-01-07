package com.company;

public class ParamTest {

    public int pointTest(Point point){
        point = new Point();
        point.x = 3;
        point.y = 4;

        return point.x;

}

    public static void main(String[] args){
        ParamTest pt = new ParamTest();
        Point point = new Point();

        int x = pt.pointTest(point);
        System.out.println(x);
        System.out.println(point.x);
        System.out.println(point.y);
    }
}

class Point{
    int x;
    int y;
}