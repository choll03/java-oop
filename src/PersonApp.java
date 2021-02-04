public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person("Mail", "Bogor");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Abdul");

        Person person2 = new Person("Budi", "jakarta");

        Person person3;
        person3 = new Person("Joko", "Cirebon");


    }
}
