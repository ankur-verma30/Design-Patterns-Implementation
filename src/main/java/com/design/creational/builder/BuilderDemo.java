package com.design.creational.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        Computer computer=
                new Computer.Builder().setCPU("i7").setRAM("16GB").setStorage("1TB").setGraphicCard(true).build();
        System.out.println(computer);
    }
}
