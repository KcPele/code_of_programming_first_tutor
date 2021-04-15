package InnerClassInJaava;

public class Robot {
    private int id;

    private class Brain{
        public void think(){
            System.out.println("Robot "+ id + "is thinking");
        }
    }
        static class Battery{
        private int percentage;
        protected Battery(int percentage){
            this.percentage = percentage;
        }
        public void charge(){
            System.out.println("Battery is charging " + percentage+ "%" + " remaining");
        }
        }

    public Robot(int id){
        this.id = id;
    }
    public  void start(){
        System.out.println("starting robot" + id);
        Brain brain = new Brain();
        brain.think();
        String name = "Robot";
        class Temp{
            public void doSomeThing(int num){
                System.out.println( num + "ID is " + id);
                System.out.println("My name is "+ name);
            }
        }
        Temp temp = new Temp();
        temp.doSomeThing(3);
    }
}
