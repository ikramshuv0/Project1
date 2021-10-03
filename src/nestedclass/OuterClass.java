package nestedclass;



public class OuterClass {
//    outer class constructor
    private int outerNum1 = 10;

    public OuterClass() {


    }
    Inner innerA = new Inner();
    InnerB innerB = new InnerB();
// outer class method
    public void outerMethodA() {
        System.out.println("outer class method A");

    }

    public void outerMethodB() {
        System.out.println("outer class method B");

    }
//inner class A
    public class InnerA{
//        Inner class constructor
public InnerA(){

}
    }
    public class InnerB{
//        inner class variables
        int numB = 6;
//        inner class methods
        public void innermethodB() {
            System.out.println("this is InnerB method");
        }
    } Inner class B ends here
} Outer class ends here
