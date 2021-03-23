package oslomet.webprog.obliguke12;

abstract class Mobel implements Comparable<Mobel>{

    private String navn;
    private int vekt;
    private double pris;
    private int nummer;

    public Mobel (String navn, int vekt, double pris, int nummer) {
        this.navn = navn;
        this.vekt = vekt;
        this.pris = pris;
        this.nummer = nummer;
    }

    public String getNavn () {
        return this.navn;
    }

    public int getVekt () {
        return this.vekt;
    }

    public double getPris () {
        return this.pris;
    }

    public int getNummer () {
        return this.nummer;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setVekt(int vekt) {
        this.vekt = vekt;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    @Override
    public int compareTo(Mobel m) {
        if (this.getNummer() > m.getNummer()) {
            return 1;
        } else if (this.getNummer() < m.getNummer()) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return this.nummer + "_" + this.navn;
    };
}