package prviZad;

/*  Napiši klasu „Zarulja“ koja ima jedan privatni član bool tipa: „Stanje“, defaultni konstruktor
    koji postavlja stanje u FALSE te javne metode „PritisniPrekidac“ koji će paliti i gasiti žarulju i
    „Provjeri“ koja će ispisivati „Svijetli“ ili „Mrak je“ ovisno o trenutnom stanju (0 – mrak, 1 -
    svijetli). Kreiraj objekt „Osram“ klase „Zarulja“ te upali i ugasi žarulju nekoliko puta*/

public class Zarulja {

    private boolean stanje;

    public Zarulja() {
        stanje = false;
    }

    public boolean getStanje() {
        return stanje;
    }

    public void PritisniPrekidac() {
        this.stanje = !this.stanje;
    }

    public void Provjeri() {

        if(this.stanje) {
            System.out.println("Svijetli");
        } else {
            System.out.println("Mrak je");
        }

    }

    public static void main(String[] args) {

        Zarulja Osram = new Zarulja();

        Osram.Provjeri();

        Osram.PritisniPrekidac();
        Osram.Provjeri();

        Osram.PritisniPrekidac();
        Osram.Provjeri();

    }
}