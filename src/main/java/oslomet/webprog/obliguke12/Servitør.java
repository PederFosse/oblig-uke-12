package oslomet.webprog.obliguke12;

public class Servitør {
    private String navn;
    private String servitørNr;

    public Servitør(String navn, String servitørNr) {
        this.navn = navn;
        this.servitørNr = servitørNr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getServitørNr() {
        return servitørNr;
    }

    public void setServitørNr(String servitørNr) {
        this.servitørNr = servitørNr;
    }
}
