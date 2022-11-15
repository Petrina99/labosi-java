package drugi;

import java.io.*;
import java.util.Scanner;

public class Student implements Serializable {

    int maticniBroj;
    String ime;
    String prezime;
    String fakultet;
    String smjer;
    int godina;
    float prosjecnaOcjena;

    public  Student() {
        this.maticniBroj = 0;
        this.ime = "";
        this.prezime = "";
        this.fakultet = "";
        this.smjer = "";
        this.godina = 0;
        this.prosjecnaOcjena = 0.0F;
    }

    public Student(int mat, String ime, String prezime, String faks, String smjer, int god, float prosOc) {
        this.maticniBroj = mat;
        this.ime = ime;
        this.prezime = prezime;
        this.fakultet = faks;
        this.smjer = smjer;
        this.godina = god;
        this.prosjecnaOcjena = prosOc;
    }

    public int getMaticniBroj() {
        return maticniBroj;
    }

    public void setMaticniBroj(int maticniBroj) {
        this.maticniBroj = maticniBroj;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getFakultet() {
        return fakultet;
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }

    public String getSmjer() {
        return smjer;
    }

    public void setSmjer(String smjer) {
        this.smjer = smjer;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public float getProsjecnaOcjena() {
        return prosjecnaOcjena;
    }

    public void setProsjecnaOcjena(float prosjecnaOcjena) {
        this.prosjecnaOcjena = prosjecnaOcjena;
    }

    public static void main(String[] args) {

        Student []studenti = new Student[10];

        File file = new File("studenti.ser");

        CreateSeriazable app = new CreateSeriazable();

        app.openFileOutput(file);

        // istovremeno upisivanje studenata u niz i upisivanje u datoteku
        for (int i = 0; i < studenti.length; i++) {
            studenti[i] = upisStudenta(studenti[i], file);
            app.dodajStudenta(studenti[i]);
        }

        app.closeFile();
        app.openFileInput(file);

        float suma = 0;

        for (int i = 0; i < studenti.length; i++) {
            suma += app.iscitajStudenta();
        }

        app.closeFile();
        System.out.println("Prosjek ocjena svih studenata iznosi: " + (suma / studenti.length));
    }

    public static Student upisStudenta(Student stud, File file) {

        Scanner in = new Scanner(System.in);

        stud = new Student();

        System.out.println("Maticni broj: ");
        stud.setMaticniBroj(in.nextInt());

        System.out.println("Ime: ");
        stud.setIme(in.next());

        System.out.println("Prezime: ");
        stud.setPrezime(in.next());

        System.out.println("Fakultet: ");
        stud.setFakultet(in.next());

        System.out.println("Smjer: ");
        stud.setSmjer(in.next());

        System.out.println("Godina: ");
        stud.setGodina(in.nextInt());

        System.out.println("Prosjek ocjena: ");
        stud.setProsjecnaOcjena(in.nextFloat());

        return stud;
    }
}
