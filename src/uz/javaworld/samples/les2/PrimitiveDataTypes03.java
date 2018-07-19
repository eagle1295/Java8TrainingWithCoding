package uz.javaworld.samples.les2;

/**
 * Check to max values data types
 */
public class PrimitiveDataTypes03 {

    /**
     * First start class with out changes.
     * After it is look at the results in the console.
     * Uncomment all comments line and again start app.
     * And compare 2 result.
     *
     * @param args do not user args
     */
    public static void main(String[] args){

        byte bVal =Byte.MAX_VALUE;
//        if(bVal<Byte.MAX_VALUE){
            bVal++;// increment
//        }
        System.out.println("Byte : " +bVal);

        short shVal =Short.MAX_VALUE;
//        if(shVal<Short.MAX_VALUE){
            shVal++;// increment
//        }
        System.out.println("Short : " +shVal);

        int iVal =Integer.MAX_VALUE;
//        if(iVal<Integer.MAX_VALUE){
            iVal++;// increment
//        }
        System.out.println("Integer : " +iVal);

        long lVal =Long.MAX_VALUE;
//        if(lVal<Long.MAX_VALUE){
            lVal++;// increment
//        }
        System.out.println("Long : " +lVal);

        float fVal = Float.MAX_VALUE;
//        if(fVal<Long.MAX_VALUE){
            fVal++;// increment
//        }
        System.out.println("Float : " +fVal);

        double dVal = Double.MAX_VALUE;
        if(dVal<Long.MAX_VALUE){
            dVal++;// increment
        }
        System.out.println("Double : " +dVal);
    }
}
