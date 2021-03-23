package oslomet.webprog.obliguke12;

public class Bord extends Mobel{
    private int antallBen;

    public Bord(String navn, int vekt, double pris, int nummer, int antallBen) {
        super(navn, vekt, pris, nummer);
        this.antallBen = antallBen;
    }

    public String toString() {
        return super.toString() + "Type: Bord_Antall ben: " + this.antallBen;
    }

    public int getAntallBen() {
        return this.antallBen;
    }

    public void setAntallBen(int ben) {
        this.antallBen = ben;
    }
}
