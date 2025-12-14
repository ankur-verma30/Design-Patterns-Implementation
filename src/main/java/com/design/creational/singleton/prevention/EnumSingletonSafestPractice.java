package com.design.creational.singleton.prevention;

public enum EnumSingletonSafestPractice {
    INSTANCE;

    public void doSomething(){
        System.out.println("Singleton instance is doing something");
    }

    public static void main(String[] args) {
        EnumSingletonSafestPractice instance1=EnumSingletonSafestPractice.INSTANCE;
        EnumSingletonSafestPractice instance2=EnumSingletonSafestPractice.INSTANCE;

        System.out.println(instance1==instance2);
        instance1.doSomething();
        instance2.doSomething();
        System.out.println(System.identityHashCode(instance1));
        System.out.println(System.identityHashCode(instance2));
    }
}
