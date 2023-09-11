package pac1;

class MyPrivateClass {
    public int  privateField=42;

    public void privateMethod() {
        System.out.println(privateField);
        // This method can only be accessed within this class.
    }
}
