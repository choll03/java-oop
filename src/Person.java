class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is " + this.name);
    }
}