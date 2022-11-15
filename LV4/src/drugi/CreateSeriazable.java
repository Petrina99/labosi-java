package drugi;

import java.io.*;

public class CreateSeriazable {

    private ObjectOutputStream output;
    private ObjectInputStream input;

    /* otvara stream za ispis podataka u datoteku*/
    public void openFileOutput(File file) {
        try {
            FileOutputStream f = new FileOutputStream(file, false);
            output = new ObjectOutputStream(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // stream za ucitavanje podataka
    public void openFileInput(File file) {
        try {
            FileInputStream f = new FileInputStream(file);
            input = new ObjectInputStream(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void closeFile() {
        if (output != null) {
            try {
                output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // upisuje trenutni objekat u datoteku
    public void dodajStudenta(Student stud) {
        try {
            output.writeObject(stud);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // iscitava trenutni objekat iz datoteke i vraca njihovu prosjecnu ocjenu
    public float iscitajStudenta() {

        Student stud = new Student();

        try {
            stud = (Student) input.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return stud.getProsjecnaOcjena();
    }
}
