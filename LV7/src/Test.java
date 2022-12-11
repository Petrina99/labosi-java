public class Test {

    public static void main(String[] args) {

        // ovo radi kad extendamo Raketa klasu sa Thread klasom 1. zadatak
        /*
        for (int i = 1; i <= 5; i++) {
            Raketa r = new Raketa("R" + i);
            r.start();
        } */

        // ovo radi kad koristimo runnable 2. zadatak

        /*
        for (int i = 1; i <= 5; i++) {
            Raketa r = new Raketa("R" + i);
            Thread nit = new Thread(r);
            nit.start();
        } */

        // 3. zadatak

        Raketa r = new Raketa("r");


        Thread nit1 = new Thread(r);
        Thread nit2 = new Thread(r);
        Thread nit3 = new Thread(r);

        nit1.start();
        nit2.start();
        nit3.start();
    }
}
