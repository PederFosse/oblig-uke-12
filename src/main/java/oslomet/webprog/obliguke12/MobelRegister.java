package oslomet.webprog.obliguke12;

import java.util.LinkedList;

public class MobelRegister {
    public LinkedList<Mobel> register;
    public MobelRegister() {
        register = new LinkedList<>();
    }

    public void add(Mobel mobel) {
        register.add(mobel);
    }

    public Mobel get(int nummer) {
        for (Mobel mobel : register) {
            if (mobel.getNummer() == nummer) {
                return mobel;
            }
        }
        return null;
    }

    public void delete(int nummer) {
        register.remove(this.get(nummer));
    }

    public void printAll() {
        String ut = "Alle møbler:\n";
        for (Mobel mobel : register) {
            ut += mobel.toString() + ", ";
        }
        ut = ut.substring(0, ut.length() - 2);
        System.out.println(ut);
    }
}