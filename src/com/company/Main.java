package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String namea = "Hello";
        System.out.println(namea);
        String [] names = {"Mansur","Akbar","Aziz","Jurabek"};
        int [] nameS1 = {10,20,30,40};

        for (String name : names){
            System.out.println(name);

            for (int i : nameS1){
                System.out.println(i);
            }
        }

    }
}
