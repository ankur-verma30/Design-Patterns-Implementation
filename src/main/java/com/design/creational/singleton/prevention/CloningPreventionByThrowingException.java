package com.design.creational.singleton.prevention;

public class CloningPreventionByThrowingException implements Cloneable{
    private static CloningPreventionByThrowingException instance=new CloningPreventionByThrowingException();

    private CloningPreventionByThrowingException(){

    }

    public static CloningPreventionByThrowingException getInstance(){
        return instance;
    }

    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException("Cloning is not allowed");
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloningPreventionByThrowingException instance1=CloningPreventionByThrowingException.getInstance();
        CloningPreventionByThrowingException instance2=(CloningPreventionByThrowingException) instance1.clone();

        System.out.println(instance1==instance2);
    }
}
