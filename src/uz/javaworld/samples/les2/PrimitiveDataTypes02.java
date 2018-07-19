package uz.javaworld.samples.les2;

/**
 * Declaration primitive data types and use example
 */
public class PrimitiveDataTypes02 {

    /**
     * Declaration primitive data types, set values and print to console their values.
     *
     * @param args do not use args
     */
    public static void main(String[] args){
        byte b = 13;
        short sh = 3457;
        int i = 12798;
        long l = 234L;
        float f = 517.01F;
        double d = 1024.10d;

        boolean bool = true;
        char sym = 'J';

        System.out.println("Byte      :"+b);
        System.out.println("Short     :"+sh);
        System.out.println("Integer   :"+i);
        System.out.println("Long      :"+l);
        System.out.println("Float     :"+f);
        System.out.println("Double    :"+d);
        System.out.println("Boolean   :"+bool);
        System.out.println("Character :"+sym);
    }
}
