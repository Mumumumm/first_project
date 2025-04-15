package classpackag;

public class Example01 {
    public static void main(String[]args){
        Example02.myMethod1();

        System.out.println("======================================");

        Example02 myObject = new Example02();
        myObject.myMethod2();
    }
}
