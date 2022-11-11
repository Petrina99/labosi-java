import java.util.Scanner;

public class Zadatak {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = 0, m = 0;

        System.out.println("Unesite dimenziju vektora [2, 10]: ");
        do {

            try {
                n = input.nextInt();
            } catch (Exception E) {
                System.out.println("Unesite broj");
                input.next();
            }

            if(n <= 2 || n >= 10) {
                System.out.println("Unesite broj u intervalu od 2 do 10");
            }
        } while (n <= 2 || n >= 10);

        System.out.println("Unesite dimenzije kvadratne matrice [1, 5]: ");

        do {

            try {
                m = input.nextInt();
            } catch (Exception E) {
                System.out.println("Unesite broj");
                input.next();
            }

            if(m <= 1 || m >= 5) {
                System.out.println("Unesite broj u intervalu od 2 do 10");
            }
        } while (m <= 1 || m >= 5);

        System.out.println("Popunite vektor: ");

        int[] vektor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite element na " + (i + 1) + " mjestu u vektoru.");
            vektor[i] = input.nextInt();
        }

        System.out.println("Popunite kvadratnu matricu: ");

        int[][] matrica = new int[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Unesite element u " + (i + 1) + ". redu i " + (j + 1) + ". stupcu: ");
                matrica[i][j] = input.nextInt();
            }
        }

        System.out.println("Odaberite jednu od opcija: ");
        System.out.println("1. Izračunati aritmetičku sredinu sporedne dijagonale");
        System.out.println("2. Izračunati sumu neparnih elemenata prvog retka i prvog stupca matrice. Ukoliko\n" +
                "ne postoje neparni elementi ispisati da nije bilo moguće izračunati sumu");
        System.out.println("3. Ispisati sve brojeve na parnim indeksima vektora V");
        System.out.println("Pritisnite bilo koju drugu tipku za izlaz iz programa");

        int opcija = 0;

        while (opcija != -1) {

            opcija = input.nextInt();

            switch(opcija) {
                case 1:
                    aritmetickaSredina(matrica);
                    break;
                case 2:
                    sumaNeparnih(matrica);
                    break;
                case 3:
                    ispisiParne(vektor);
                    break;
                default:
                    break;
            }

        }
    }

    public static void aritmetickaSredina(int[][] p) {

        float suma = 0;

        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {

                if (i + j == p.length - 1) {
                    suma += (float)p[i][j];
                }
            }
        }

        System.out.println(suma / p.length);
    }

    public static void sumaNeparnih(int[][] p) {

        int suma = 0;

        for (int i = 0; i < p.length; i++) {

            if (p[0][i] % 2 != 0) {
                suma += p[0][i];
            }

            if (p[i][0] % 2 != 0) {
                suma += p[i][0];
            }
        }

        if (suma == 0) {
            System.out.println("Ne postoje neparni elementi");
        } else {
            System.out.println(suma);
        }
    }

    public static void ispisiParne(int[] p) {

        for (int i = 0; i < p.length; i++) {
            if (i % 2 != 0) {
                continue;
            }

            System.out.println(p[i]);
        }
    }
}
