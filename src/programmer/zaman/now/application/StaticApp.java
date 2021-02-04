package programmer.zaman.now.application;

import programmer.zaman.now.Util.MathUtil;
import static programmer.zaman.now.data.Application.PROCCESSORS;
import static programmer.zaman.now.data.Constant.*;
import programmer.zaman.now.data.Country;

public class StaticApp {

    public static void main(String[] args) {

        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(MathUtil.sum(1,2,3,4,5));

        Country.City city = new Country.City();
        city.setName("Bogor");

        System.out.println(city.getName());

        System.out.println(PROCCESSORS);
    }
}
