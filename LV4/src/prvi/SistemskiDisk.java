package prvi;

import java.io.File;

public class SistemskiDisk {

    public static void main(String[] args) {
        File pocetniDirektorij = new File("D:\\Faks\\1.semestar\\fizika");

        // dodo sam varijablu mode da program zna kad samo ispisuje a kad ispisuje i ispravlja imena datoteka
        // 0 - samo ispisuje, 1 - ispisuje i ispravlja
        ispisiHijerarhiju(pocetniDirektorij, 1, 0);
        ispisiHijerarhiju(pocetniDirektorij, 1, 1);
    }

    public static void ispisiHijerarhiju(File f, int razmak, int mode) {
        // kad ulazi prvi put u program razmak je 1 i dobijemo jednu crticu i to se povecava sto je hijerarhija dublja
        for (int i = 0; i < razmak; i++) {
            System.out.print('-');
        }

        if (mode == 0) {
            if (f.isDirectory()) {
                System.out.println("direktorij: " + f.getName());
            } else {
                System.out.println("datoteka: " + f.getName());
            }
        } else {
            if (f.isDirectory()) {
                System.out.println("direktorij: " + ispravi(f));
            } else {
                System.out.println("datoteka: " + ispravi(f));
            }
        }


        /* ako je trenutni file direktorij ulazimo u njega i ispisujemo sve datoteke u njemu i dodajemo im razmak
        da bi naglasili hijerarhiju*/
        /* ako unutar trenutnog direktorija naidemo na jos jedan poddirektorij onda se i za njega posebno ispisuju datoteke sa razmakom
        i tako u krug dok ne dodemo do posljedneg direktorija i posljednje datoteke kada se program zavrsava*/
        /* sto dublje udemo unutar hijerarhije to ce razmak biti veci*/

        if (f.isDirectory()) {

            File[] files = f.listFiles();

            for (File file : files) {
                ispisiHijerarhiju(file, razmak + 2, mode);
            }
        }
    }

    public static String ispravi(File f) {
        String ime = f.getName();

        // sa substring(1) izbacujemo prvi znak iz stringa
        if (ime.charAt(0) >= 'a' && ime.charAt(0) <= 'n') {
            char a = ime.charAt(0);
            return Character.toUpperCase(a) + ime.substring(1);
        }

        if (ime.charAt(0) >= 'o' && ime.charAt(0) <= 'z') {
            char zadnjeSlovo = ime.charAt(ime.length() - 1);

            if (Character.isLowerCase(zadnjeSlovo)) {
                return ime.toUpperCase();
            }
        }
        return ime;
    }
}
