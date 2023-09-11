package pac1;

class MyChildClass extends MyParentClass {
    // You should define anotherMethod outside of main
    public void anotherMethod() {
        // Accessing the protected field and method through an instance
        protectedField = 42;      // Accessing the protected field from a subclass.
        protectedMethod();        // Accessing the protected method from a subclass.
    }

    public static void main(String[] args) {
        MyChildClass myObject2 = new MyChildClass();
        myObject2.anotherMethod(); // Call anotherMethod through an instance
    }
}