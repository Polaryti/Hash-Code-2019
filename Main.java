import java.io.FileNotFoundException;
import java.util.LinkedList;
/**
 * Main
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        LinkedList<Photo> list = Generador.devArL();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        LinkedList<Photo> vertical = Separador.getV(list);
        LinkedList<Photo> horizontal = Separador.getH(list);
        System.out.println();
        for (int i = 0; i < vertical.size(); i++) {
            System.out.println(vertical.get(i));
        }
        System.out.println();
        for (int i = 0; i < vertical.size(); i++) {
            System.out.println(horizontal.get(i));
        }
    }
}