package Inheritance;

import Inheritance.Machine;

public class Car extends Machine {
    @Override
    public void start(){
        System.out.println("Inheritance.Car started");
    }
    public void WipeWindShield(){

        System.out.println("Wiping Wind Shied");
    }
}
