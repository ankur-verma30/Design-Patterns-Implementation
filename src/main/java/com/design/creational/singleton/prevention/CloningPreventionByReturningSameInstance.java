package com.design.creational.singleton.prevention;

public class CloningPreventionByReturningSameInstance implements Cloneable{
    private static CloningPreventionByReturningSameInstance instance=new CloningPreventionByReturningSameInstance();

    private CloningPreventionByReturningSameInstance(){

    }

    public static CloningPreventionByReturningSameInstance getInstance(){
        return instance;
    }

    protected Object clone() throws CloneNotSupportedException{
        return instance;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloningPreventionByReturningSameInstance instance1=CloningPreventionByReturningSameInstance.getInstance();
        CloningPreventionByReturningSameInstance instance2=(CloningPreventionByReturningSameInstance) instance1.clone();

        System.out.println(instance1==instance2);
    }
}
