import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * mainProg
 */

public class mainProg {

    public ArrayList<Photo> getV(ArrayList<Photo> photos) {
        ArrayList<Photo> vertical = new ArrayList<Photo>();
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

    public ArrayList<Photo> getH(ArrayList<Photo> photos) {
        ArrayList<Photo> horizontal = new ArrayList<Photo>();
        Photo aux;

        for (int i = 0; i < photos.size(); i++) {
            aux = photos.get(i);
            if (aux.tipo) {
                aux.setX(i);
                horizontal.add(aux);
            }
        }

        return horizontal;
    }
}