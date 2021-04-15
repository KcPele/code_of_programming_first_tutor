package casting;

public class CastingNum {
    public static void main(String[] args) {
        int intValue = 888;
        short shortValue = 44;
        byte byteValue = 20;
        long longValue = 4465467;
        float floatValue = 4634.5f;
        float floatValue2= (float)34.6;
        double douleValue = 34.5;
        System.out.println(Byte.MAX_VALUE);
        intValue = (int) longValue;
        System.out.println(intValue);
        douleValue = intValue;
        System.out.println(douleValue);
        intValue = (int)floatValue;
        System.out.println(intValue);
        byteValue = (byte)128;
        System.out.println(byteValue);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        float floating = 3.568798976f;

    }
}
