package MultiSerialiation;

import java.io.Serializable;

public class Person implements Serializable {
    private int num;
    private String name;
    public Person(int num, String name){
        this.name = name;
        this.num  = num;
    }
    @Override
    public String toString(){
        return  "Person[id=" + num + ", name= " + name + "]";
    }
}
