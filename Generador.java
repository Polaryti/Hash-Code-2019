import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Generador {

    private static final File FILE_IN = new File("a_example.txt");
    private static final File FILE_OUT = new File("a_example_out.txt");

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(FILE_IN);
        ArrayList<Photo> res = new ArrayList<>();
        int cont = sc.nextInt();
        for (int i = 0; i < cont; i++) {
            String pos = sc.next().trim();
            int l = Integer.parseInt(sc.next().trim());
            String[] t = new String[l];
            for (int j = 0; j < l; j++) {
                t[j] = sc.next().trim();
            }
            Photo ph = new Photo(pos, l, t);
            ph.toStrin();
            res.add(ph);
        }
        System.out.println(res.size());
        sc.close();
    }
}