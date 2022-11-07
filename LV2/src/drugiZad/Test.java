package drugiZad;

public class Test {

    public static void main(String[] args) {
        Zaposlenik zaposlenik = new Zaposlenik(12, 39, 7000);

        // provjera jel rade get i set metode

        zaposlenik.setStaz(9);
        int stazZaposlenika = zaposlenik.getStaz();

        zaposlenik.setStarost(34);
        int starostZ = zaposlenik.getStarost();

        zaposlenik.setPlaca(8000);
        int placaZ = zaposlenik.getPlaca();

        System.out.println(stazZaposlenika);
        System.out.println(starostZ);
        System.out.println(placaZ);

        int ukupnaZarada1 = zaposlenik.zaradaZaposlenika();
        int ukupnaZarada2 = Zaposlenik.ukupnaZarada(zaposlenik);

        System.out.println(ukupnaZarada1);
        System.out.println(ukupnaZarada2);
    }
}
