package programmer.zaman.now.application;

public class EqualsApp {

    public static void main(String[] args) {

        String first = "mail";
        first = first + " " + "skom";

        System.out.println(first);

        String second = "mail skom";
        System.out.println(first.equals(second));

        String third = "mail skom";
        System.out.println(third == second);
    }
}
