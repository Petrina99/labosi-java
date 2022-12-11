public class LansirnaRampa {

    public synchronized void lansiraj() throws InterruptedException {

        for(int i = 10; i >= 0; i--) {
            Thread.sleep(500);
            System.out.println(i + "...");
        }
    }
}
