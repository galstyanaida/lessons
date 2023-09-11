package pac1;

class MyParentClass {
    protected static int protectedField=150;

    protected static void protectedMethod() {
        System.out.println(protectedField);
        // This method can be accessed within the same package and in subclasses.
    }
}
