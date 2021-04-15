package AbstractClass;

public abstract class Machine {
    private int ID;

    public int getID(){
        return this.ID;
    }
    public void setID(int id){
        this.ID = id;
    }
    public abstract void start();
    public abstract void doStuff();
    public abstract void shutdown();
    public void run(){
        start();
        doStuff();
        shutdown();
    }


}
