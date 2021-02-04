package programmer.zaman.now.application;

import programmer.zaman.now.data.Customer;
import programmer.zaman.now.data.Level;

public class EnumApp {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setName("Ismail");
        customer.setLevel(Level.STANDARD);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("STANDARD");
        System.out.println(level);

        Level[] levels = Level.values();
        for (var level1 : levels) {
            System.out.println(level1);
        }
    }
}
