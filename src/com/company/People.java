package com.company;

public class People {
    int age;

    public void change(int i){
       // i++;
        System.out.println(i++);
    }

    public void change2(People p){
        p = new People();
        p.age++;
    }

    public void change3(People p, int i){
        //p = new People();
        p.age++;
        i++;
    }

    public static void main(String[] args){
        People people = new People();
        int a = 0;
       // people.change(people.age);
       // people.change2(people);
        people.change3(people,people.age);
        System.out.println(people.age);
    }
}

