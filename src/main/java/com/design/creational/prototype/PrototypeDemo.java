package com.design.creational.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        Employee original = new Employee(1,"Ankur","Developement");
        Employee cloned = (Employee) original.clone();

        System.out.println(original==cloned);
        cloned.setName("Isha");

        System.out.println(original);
        System.out.println(cloned);
    }
}
