package TransientKey;

public class Person {
    private transient int num;
    private String name;
    private static  int count;
    public Person(int num, String name){
        this.name = name;
        this.num  = num;
    }
    public static int  getCount(){
        return count;
    }
    public static void setCount(int count){
        Person.count = count;
    }
    @Override
    public String toString(){

        return  "Person[id=" + num + ", name= " + name + "]" + "count is" + count;
    }
}
