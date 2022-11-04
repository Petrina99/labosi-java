package prviZad;

public class Test {

    public static void main(String[] args) {
        Zarulja Osram = new Zarulja();

        boolean stanje = Osram.getStanje();
        Osram.Provjeri(stanje);

        stanje = Osram.PritisniPrekidac(stanje);
        Osram.Provjeri(stanje);

        stanje = Osram.PritisniPrekidac(stanje);
        Osram.Provjeri(stanje);
    }

}
