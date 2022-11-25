package pasIMacka;

import sisavac.Sisavac;

public class Macka extends Sisavac {

    private String vrsta;
    private String ime;

    public Macka() {
        this.ime = "Macka";
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public void opisi() {
        System.out.println("Vrsta: " + getVrsta());
        System.out.println("Dob: " + getDob());
        System.out.println("Tezina: " + getTezina());
    }
}
