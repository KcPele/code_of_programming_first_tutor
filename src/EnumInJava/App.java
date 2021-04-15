package EnumInJava;


 enum Animal {
     CAT("fercus"), DOG("bravo"), FISH("caryfish");
     private String name;
      Animal(String name ){
          this.name = name;
     }
     public String getName(){
          return name;
     }
     public String toString(){
          return " This animal is called" + name;
     }
}

public class App {

    public static void main(String[] args) {
        Animal animal = Animal.CAT;

    switch (animal) {
        case CAT:
            System.out.println("cat");
            break;
        case DOG:
            System.out.println("dog");
            break;
        case FISH:
            break;
        default:
            break;
    }
        System.out.println(Animal.DOG);
        System.out.println("enum name as a string: " + Animal.DOG.name());
        System.out.println(Animal.DOG.getClass());
        System.out.println(Animal.DOG instanceof Enum);
        System.out.println(Animal.DOG.getName());
        Animal animal2 = Animal.valueOf("CAT");
        System.out.println(animal2);
    }
}
