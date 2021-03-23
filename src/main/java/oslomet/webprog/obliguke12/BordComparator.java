package oslomet.webprog.obliguke12;

import java.util.Comparator;

public class BordComparator implements Comparator<Bord> {
    public int compare(Bord b1, Bord b2) {
        if (b1.getAntallBen() == b2.getAntallBen()) { // same amount of legs
            return 0;
        } else if (b1.getAntallBen() > b2.getAntallBen()) { // b1 has more legs than b2
            return 1;
        } else { // b1 has less legs than b2
            return -1;
        }
    }
}
