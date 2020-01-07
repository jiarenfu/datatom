package com.company;

public class ParamTest3 {
    public void changeName(Person person,Person person2){
        person.name = "lisi";
        person2.name = "wangwu";
    }

    public static void main(String[] args){
        ParamTest3 pt = new ParamTest3();
        Person person = new Person();
        person.name = "zhangsan";
       // Person person2 = person;
        Person person2 = new Person();
        pt.changeName(person,person2);
        System.out.println(person.name);
        System.out.println(person2.name);

    }
}

class Person{
    String name;
}
