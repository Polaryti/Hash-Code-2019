import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class Generador {

    private class Photo {
        public boolean tipo;
        public String[] tags;

        public Photo(String p, int n) {
            if (p.equals("H")) {
                tipo = false;
            } else {
                tipo = true;
            }

            tags = new String[n];
        } 

        public void toStrin() {
            System.out.println(tags.length);
        }
    }

    private static final File FILE_IN = new File("a_example.txt");
    private static final File FILE_OUT = new File("a_example_out.txt");

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(FILE_IN);
        ArrayList<Photo> res = new ArrayList<>();
        int cont = sc.nextInt();
        for (int i = 0; i < cont; i++) {
            String pos = sc.next();
            int l = sc.nextInt();
            String[] t = new String[l];
            for (int j = 0; j < l; j++) {
                t[i] = sc.next();
            }
        }
        sc.close();
    }
}