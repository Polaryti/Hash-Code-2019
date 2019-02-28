import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.LinkedList;
/**
 * Separador
 */

public class Separador {

    public static LinkedList<Photo> getV(LinkedList<Photo> photos) {
        LinkedList<Photo> vertical = new LinkedList<Photo>();
        Photo aux;

        for (int i = 0; i < photos.size(); i++) {
            aux = photos.get(i);
            if (aux.tipo) {
                aux.setX(i);
                vertical.add(aux);
            }
        }

        return vertical;
    }

    public static LinkedList<Photo> getH(LinkedList<Photo> photos) {
        LinkedList<Photo> horizontal = new LinkedList<Photo>();
        Photo aux;

        for (int i = 0; i < photos.size(); i++) {
            aux = photos.get(i);
            if (!aux.tipo) {
                aux.setX(i);
                horizontal.add(aux);
            }
        }

        return horizontal;
    }
}