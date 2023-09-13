package pac1;

class MyPrivateClass {
    private int  privateField=42;

    private void privateMethod() {
        System.out.println(privateField);
        // This method can only be accessed within this class.
    }
}
