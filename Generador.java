import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;

public class Generador {
    private static final File FILE_IN = new File("a_example.txt");

    public static LinkedList<Photo> devArL() throws FileNotFoundException {
        Scanner sc = new Scanner(FILE_IN);
        LinkedList<Photo> res = new LinkedList<>();
        int cont = sc.nextInt();
        for (int i = 0; i < cont; i++) {
            String pos = sc.next().trim();
            int l = Integer.parseInt(sc.next().trim());
            String[] t = new String[l];
            for (int j = 0; j < l; j++) {
                t[j] = sc.next().trim();
            }
            Photo ph = new Photo(pos, l, t);
            res.add(ph);
        }
        sc.close();
        return res;
    }


    public <T> LinkedList<T> union(LinkedList<T> list1, LinkedList<T> list2) {
        Set<T> set = new HashSet<T>();

        set.addAll(list1);
        set.addAll(list2);

        return new LinkedList<T>(set);
    }
}