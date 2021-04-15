package EqualsTutor;
class Person{
    private int id;
    private String name;
    public Person(int id, String name){
        this.name = name;
        this.id = id;

    }
    @Override
    public String toString(){
        return "Person [id=" + id + ", name=" + name + "]";
    }
    public int hashCode(){
        final  int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person)obj;
        if(id != other.id)
            return false;
        if (name == null){
            if (other.name != null)
                return false;
        }else if(!name.equals(other.name))
            return false;
        return true;

    }
}

public class App {
    public static void main(String[] args) {
        System.out.println(new Object());

        Person person1 = new Person(5, "Fide");
        Person person2 = new Person(5, "Fide");

        System.out.println(person1.equals( person2));

        Double value1 = 7.2;
        Double value = 7.2;
        System.out.println(value1 == value);
        Integer num1 = 3;
        Integer num2 = 3;
        System.out.println(num1 == num2);

        String text1 = "Hello";
        String text2 = "Hellojidj".substring(0,5);
        System.out.println(text2);
        System.out.println(text1.equals(text2));


    }
}
