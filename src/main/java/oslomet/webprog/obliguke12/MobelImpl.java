package oslomet.webprog.obliguke12;

public class MobelImpl extends Mobel {
    public MobelImpl(String navn, int vekt, double pris, int nummer) {
        super(navn, vekt, pris, nummer);
    }

    public String toString() {
        return this.getNummer() + "_" + this.getNavn();
    }

}