package oslomet.webprog.obliguke12;

import java.util.Comparator;

public class MobelComparator implements Comparator<Mobel> {
    public int compare(Mobel m1, Mobel m2) {
        return m1.getNavn().compareTo(m2.getNavn());
    }
}
