public class Raketa implements Runnable{

    String ime;
    LansirnaRampa rampa;

    public Raketa(String ime) {
        this.ime = ime;
        rampa = new LansirnaRampa();
    }

    public void run() {
        System.out.println("Raketa " + ime + " krece s lansiranjem");

        try {
            synchronized (this) {
                rampa.lansiraj();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Raketa " + ime + " je lansirana.");
    }
}
