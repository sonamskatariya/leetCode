package com.example.factorypattern;

public class SingeltonFactoryPattern {

    private static  SingeltonFactoryPattern instance;

    private SingeltonFactoryPattern() {
    }

        public static synchronized SingeltonFactoryPattern getInstance () {

            if (instance == null) {
                instance = new SingeltonFactoryPattern();
            }

        return instance;
    }
        public static  void main(String[] args){
            SingeltonFactoryPattern s1= SingeltonFactoryPattern.getInstance();
            SingeltonFactoryPattern s2= SingeltonFactoryPattern.getInstance();
            SingeltonFactoryPattern s3= SingeltonFactoryPattern.getInstance();

            // Printing the hash code for above variable as
            // declared
            System.out.println("Hashcode of x is "
                    + s1.hashCode());
            System.out.println("Hashcode of y is "
                    + s2.hashCode());
            System.out.println("Hashcode of z is "
                    + s3.hashCode());
        }
}
