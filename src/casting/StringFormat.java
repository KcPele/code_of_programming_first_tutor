package casting;

public class StringFormat {
    public static void main(String[] args) {
        // inefficient
        String info = "";
        info += "My name is Fidekg.";
        info += " ";
        info += "I am a builder.";
        System.out.println(info);
//more efficient
        StringBuilder sb = new StringBuilder("");
        sb.append("My name is Fidekg");
        sb.append(" ");
        sb.append("I am a java profro");
        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();
        s.append("My name is solo")
        .append(" ")
        .append("He will be a doctor soon");
        System.out.println(s.toString());

        //formatting
        System.out.println("Here is some text.\tthat was a tab\nthat is a ne line");

        System.out.printf("Total cost %-10d; quantity is %d\n", 5, 120);
        for (int i = 0; i < 20; i++) {
            System.out.printf("%2d: some text here\n", +i);
        }
        //formatting floating point
        System.out.printf("Total value: %.2f\n", 5.63234);


    }
}
