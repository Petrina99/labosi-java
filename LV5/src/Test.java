import pasIMacka.Macka;
import pasIMacka.Pas;
import sisavac.Sisavac;

public class Test {

    public static void main(String[] args) {
        Sisavac sisavac = new Sisavac();
        Pas pas = new Pas();
        Macka macka = new Macka();

        sisavac.setDob(15);
        sisavac.setTezina(100);

        pas.setVrsta("Labrador");
        pas.setTezina(45);
        pas.setDob(4);

        macka.setVrsta("Perzijska macka");
        macka.setTezina(9);
        macka.setDob(2);

        pas.opisi();
        macka.opisi();
    }
}
