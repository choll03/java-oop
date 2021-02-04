public class PolymorphismApp {

    public static void main(String[] args) {

        Employee employee = new Employee("Ismail");
        employee.sayHello("Budi");

        employee = new Manager("Nur");
        employee.sayHello("Budi");

        employee = new VicePresident("Khasna");
        employee.sayHello("Budi");

        sayHello(new Employee("Is"));
        sayHello(new Manager("Mail"));
        sayHello(new VicePresident("Nur"));
    }

    static void sayHello(Employee employee) {

        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello manager " + manager.name);
        } else {
            System.out.println("Hello "+ employee.name);
        }
    }
}
