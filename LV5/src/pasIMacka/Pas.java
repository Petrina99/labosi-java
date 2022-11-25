package pasIMacka;

import sisavac.Sisavac;

public class Pas extends Sisavac {

    private String vrsta;
    private String ime;

    public Pas() {
        this.ime = "Pas";
    }
    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public void opisi() {
        System.out.println("Vrsta: " + getVrsta());
        // kad stavimo da je varijabla dob protected onda ju mozemo dohvatit u podklasi tak da samo napisemo njeno ime
        System.out.println("Dob: " + dob);
        // ako je varijabla private koristimo njen getter
        System.out.println("Tezina: " + getTezina());
    }
}
