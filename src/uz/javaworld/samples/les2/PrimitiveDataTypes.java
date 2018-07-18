package uz.javaworld.samples.les2;

/**
 * <b>What is Primitive data type</b>
 * <ul>
 *    <li>Numbers, Characters and boolean.</li>
 *    <li>Stored in fastest available memory.</li>
 *    <li>Primitive data types names are all lowercase.</li>
 *    <li>String is not primitive!.</li>
 * </ul>
 */
public class PrimitiveDataTypes {

    /**
     * 1.Print  Numeric data types with min, max value
     * 2.Declare data type
     * 3.Boolean,Characters
     * 4.Equivalent Helper classes
     * 5 String
     *
     * <br>
     * @param args this is example do not use args
     */
    public static void main(String[] args){

        // Print  Numeric data types with min, max value
        System.out.println("----------------------------------------------------------");
        System.out.println("|  Data Type  |   Bits  |    Minimum     |    Maximum    |");
        System.out.println("----------------------------------------------------------");
        System.out.println("|  byte       |    8    |     -128       |      127      |");
        System.out.println("|  short      |    16   |    -32,768     |     32,767    |");
        System.out.println("|  int        |    32   | -2,147,483,648 | 2,147,483,647 |");
        System.out.println("|  long       |    64   |  -9.22337E+18  |  -9.22337E+18 |");
        System.out.println("----------------------------------------------------------");
        System.out.println("|  float      |   32    |           See docs             |");
        System.out.println("|  double     |   64    |           See docs             |");
        System.out.println("-----------------``---------------------------------------");

        // Declare data type
        byte bVal = 3; // byte(Data type); bVal(Identifier); 3(Value);
        int iVal = 237; // int(Data type); bVal(Identifier); 237(Value);
        double dVal = 57.5; // double(Data type); bVal(Identifier); 57.5(Value);

        // Boolean,Characters
        System.out.println("-----------------------------------");
        System.out.println("|  Data Type  |  Value            |");
        System.out.println("-----------------------------------");
        System.out.println("|  boolean    |  true or false    |");
        System.out.println("|  char       |  2 bit(symbols)   |");
        System.out.println("-----------------------------------");

        boolean logical = true;
        char a = 'Q';

        // Equivalent Helper classes
        System.out.println("--------------------------------------");
        System.out.println("|  Data Type  |   Helper Class        |");
        System.out.println("--------------------------------------");
        System.out.println("|  byte       |   java.lang.Byte      |");
        System.out.println("|  short      |   java.lang.Short     |");
        System.out.println("|  int        |   java.lang.Integer   |");
        System.out.println("|  long       |   java.lang.Long      |");
        System.out.println("|  float      |   java.lang.Float     |");
        System.out.println("|  boolean    |   java.lang.Boolean   |");
        System.out.println("|  char       |   java.lang.Character |");
        System.out.println("|     -       |   java.lang.String |");
        System.out.println("--------------------------------------");

        String text="Hello my young java programmer";
    }
}
