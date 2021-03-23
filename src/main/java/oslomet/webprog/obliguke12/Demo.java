package oslomet.webprog.obliguke12;

import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        MobelRegister register = new MobelRegister();

        register.add(new Bord("Troy", 20, 199, 3, 3));
        register.add(new Bord("cincotrus", 50, 1000.50, 44, 5));
        register.add(new Bord("quatrus", 30, 1250.50, 1, 4));


        register.printAll();

        Collections.sort(register.register);

        register.printAll();

        Collections.sort(register.register, new MobelComparator());

        register.printAll();

        Collections.sort(register.register, new BordComparator());

        register.printAll();
    }
}
