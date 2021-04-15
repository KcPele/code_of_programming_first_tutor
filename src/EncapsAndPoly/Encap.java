package EncapsAndPoly;

import java.util.Scanner;

class Slant{
    public static final int ME = 7;
        private String name;
        public String getData(){
            String data = "some stuff" + cal();
            return data;
    }
    private int cal(){
        return 9;
    }
    public String getName(){
        return this.name;
    }
    public  void setName(String name){
        this.name = name;
    }
}


public class Encap {
    public static void main(String[] args) {

    }
}
