package pac1;

class MyChildClass extends MyParentClass {
    // You should define anotherMethod outside of main

    public int age = 12;
    private String name ="Aida";
    public void anotherMethod(int age, String name) {
        System.out.println("My name and age are   "+ age + "\n" +name);

    }

    public static void main(String[] args) {
        MyChildClass myObject2 = new MyChildClass();
        myObject2.anotherMethod(23, "Volodya"); // Call anotherMethod through an instance
        MyChilClass2 myObject3 = new MyChilClass2();
        myObject3.age=23;
        myObject3.start();

    }
}