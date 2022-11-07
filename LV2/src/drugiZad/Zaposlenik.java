package drugiZad;

public class Zaposlenik {

    private int staz, starost, placa;

    public Zaposlenik(int staz, int starost, int placa) {
        this.staz = staz;
        this.starost = starost;
        this.placa = placa;
    }

    public void setStaz(int staz) {
        this.staz = staz;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public int getStaz() {
        return staz;
    }

    public int getStarost() {
        return starost;
    }

    public int getPlaca() {
        return placa;
    }

    public int zaradaZaposlenika() {
        return this.placa * this.staz * 12;
    }

    public static int ukupnaZarada(Zaposlenik zaposlenik) {
        return zaposlenik.placa * zaposlenik.staz * 12;
    }

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
        int ukupnaZarada2 = ukupnaZarada(zaposlenik);

        System.out.println(ukupnaZarada1);
        System.out.println(ukupnaZarada2);
    }
}
