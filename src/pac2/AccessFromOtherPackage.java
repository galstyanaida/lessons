package pac2;

public class AccessFromOtherPackage {
    public static void main(String[] args) {
        // Attempting to access DefaultAccessClass from a different package
        // This will result in a compilation error because DefaultAccessClass is package-private
        DefaultAccessClass myObject = new DefaultAccessClass();
        myObject.defaultMethod();
    }
}