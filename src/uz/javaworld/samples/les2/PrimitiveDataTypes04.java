package uz.javaworld.samples.les2;

/**
 * Numbers operations
 *
 * add =       + <br>
 * subtract =  - <br>
 * multiple =  * <br>
 * divide =    / <br>
 * mod =       % <br>
 *
 * increment = ++ <br>
 * decrement = -- <br>
 *
 * add =       += <br>
 * subraction  -= <br>
 *
 */
public class PrimitiveDataTypes04 {

    public static void main(String[] args){
        int a = 9, b = 3;

        int add = a + b;
        System.out.println("Addition : " +add);

        int subtract = a - b;
        System.out.println("Subtraction : " +subtract);

        int multiple = a * b;
        System.out.println("Multiplication : " +multiple);

        int divide = a / b;
        System.out.println("Division : " +divide);

        a = 10;
        int mod = a % b;
        System.out.println("MOD : " +mod);

        a++;// increment
        System.out.println("Increment : " +a);

        b--;// decremtn
        System.out.println("Increment : " +b);

        a+=5;// equals with code a=a+5;
        System.out.println("Equals with code a=a+5; : " +a);

        b-=2;// equals with code b=b-2;
        System.out.println("Equals with code b=b-2; : " +b);

    }
}
