package TryWithResources;
class Temp implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Closing the temp method");
        throw new Exception("oh no");
    }
}


public class App {
    public static void main(String[] args) {
        try(Temp temp = new Temp()) {
        } catch (Exception e) {
            e.printStackTrace();
        } ;

    }
}
