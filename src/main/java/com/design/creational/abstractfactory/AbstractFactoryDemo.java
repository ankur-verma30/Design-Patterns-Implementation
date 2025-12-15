package com.design.creational.abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        GUIFactory factory=new DarkThemeFactory();
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
        button.paint();
        checkbox.paint();
    }
}
