package oslomet.webprog.obliguke12;

public class Kunde {
    private String navn;
    private String telefon;

    public Kunde (String navn, String telefon) {
        this.navn = navn;
        this.telefon = telefon;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
