package com.design.creational.builder;

public class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private Boolean graphicCard;

    private Computer(Builder builder){
        this.cpu=builder.cpu;
        this.cpu=builder.ram;
        this.storage=builder.storage;
        this.graphicCard=builder.graphicCard;
    }

    public static class Builder{
        private String cpu;
        private String ram;
        private String storage;
        private Boolean graphicCard;

        public Builder setCPU(String cpu){
            this.cpu=cpu;
            return this;
        }

        public Builder setRAM(String ram){
            this.ram=ram;
            return this;
        }

        public Builder setStorage(String storage){
            this.storage=storage;
            return this;
        }

        public Builder setGraphicCard(Boolean graphicCard){
            this.graphicCard=graphicCard;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

    @Override
    public String toString(){
        return "Computer = {"+
                "CPU='"+cpu+"'"+
                ", RAM='"+ram+"'"+
                ", storage='"+storage+"'"+
                ", graphicCard="+graphicCard+
                '}';
    }
}
