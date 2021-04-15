public class App {
    public static void main(String[] args) {
        int num = 4;
        StringBuffer  name = new StringBuffer("my name");
        System.out.println(name.reverse());

        String naming = "gkedif";
        String rev = "";
        for (int i = naming.length() -1 ; i >= 0; i--){
            rev = rev + naming.charAt(i);
        }
        System.out.println(rev);

    }
}
