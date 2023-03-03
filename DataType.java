import java.lang.*;

class DataType
{
    public static void main(String[] args) {
        System.out.println("Integer min value "+Integer.MIN_VALUE);
        System.out.println("Integer Max Value "+Integer.MAX_VALUE);
        System.out.println("Integer in bytes "+ Integer.BYTES);
        System.out.println("Byte min value "+Byte.MIN_VALUE);
        System.out.println("Byte max value"+Byte.MAX_VALUE);
        System.out.println("Byte in bytes"+Byte.BYTES);


        //Variable Names //
        //Case Sensitive//
        int x = 10;
        int X = 10;
        System.out.println(x+" "+X);
        //Can use Alphabets, numbers , _ , $
        //Can start with Alphabets, _, $ but not numbers//
        //Should not use keywords and should not use class name particular to the class using//
        char y = 0x0C31;
        System.out.println(y);
    }
}