package com.design.creational.singleton.breaking.cloning;

public class CloningBreaker implements Cloneable {
    private static CloningBreaker instance=new CloningBreaker();
    private CloningBreaker(){

    }

    public static CloningBreaker getInstance(){
        return instance;
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloningBreaker instance1=CloningBreaker.getInstance();
        CloningBreaker instance2=(CloningBreaker) instance1.clone();

        System.out.println(instance1==instance2); //❌ false
    }
}
