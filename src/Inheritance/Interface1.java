package Inheritance;

import Inheritance.Machine;

public class Interface1 {
    public static void main(String[] args) {
      new Machine().start();
      Info info1 = new MachineI();
      info1.showInfo();

     Person person1 =  new Person("Jhn");
     person1.greet();
     Info info2 = person1;
     info2.showInfo();

     outPutInfo(person1);
    }
    private static void outPutInfo(Info info){
       info.showInfo();
    }
}
