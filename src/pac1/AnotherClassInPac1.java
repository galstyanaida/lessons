package pac1;

public class AnotherClassInPac1 {
    public static void main(String[] args) {
        DefaultAccessClass myObject = new DefaultAccessClass();
        myObject.defaultMethod(); // Accessing the default method within the same package
    }
}