package uz.javaworld.samples.les2;

/**
 * Mathematical functions in the Math.class
 * <br>
 * <br>
 * Math.abs() return absolute value <br>
 * Math.pow() a exponent b <br>
 * Math.sqrt()  Mathematical function <br>
 * Math.max() return two variable max value <br>
 * Math.min() return two variable min value <br>
 * Math.PI constant <br>
 * Math.random() return random double value <br>
 * Math.round() round double value <br>
 */
public class PrimitiveDataTypes05 {

    public static void main(String[] args){
        int a = 6, b =10;
        int result1 = a - b;
        System.out.println("Math.abs : "+Math.abs(result1));

        a = 3;
        b = 4;
        System.out.println("Math.pow : "+Math.pow(a,b));

        a = 16;
        System.out.println("Math.sqrt : "+Math.sqrt(a));

        System.out.println("Math.max : "+Math.max(a,b));

        System.out.println("Math.min : "+Math.min(a,b));

        System.out.println("Math.PI : "+Math.PI);

        System.out.println("Math.random : "+Math.random());

        double c = 2.456, d = 4.45677;
        double result2 = d/c;
        System.out.println("Math.round : "+Math.round(result2));
    }
}
