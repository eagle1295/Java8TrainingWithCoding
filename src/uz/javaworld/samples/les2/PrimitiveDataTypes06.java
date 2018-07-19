package uz.javaworld.samples.les2;

/**
 * Boolean type declaration use in code examples
 */
public class PrimitiveDataTypes06 {

    public static void main(String[] args){
        boolean student = true,young = false;

        if(student && young){
            System.out.println("Young and student");
        } else if(student){
            System.out.println("Student not young");
        } else {
            System.out.println("Young not student");
        }
    }
}
