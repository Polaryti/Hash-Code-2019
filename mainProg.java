import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * mainProg
 */

public class mainProg {

    public ArrayList<String[]> getVT(ArrayList<Photo> photos) {
        ArrayList<String[]> vertical = new ArrayList<String[]>();

        for (int i = 0; i < photos.size(); i++) {
            if (photos.pos) {
                vertical.add(photos.tags);
            }
        }

        return vertical;
    }

    public ArrayList<String[]> getVP(ArrayList<Photo> photos) {
        int cont = 0;
        int contAux = 0;
        for (int i = 0; i < photos.size(); i++) {
            if (photos.pos) {
                cont++;
            }
        }

        int[] vertical = new int[cont];

        for (i = 0; i < photos.size() && contAux < cont; i++) {
            if (photos.pos) {
                vertical[contAux] = i;
            }
            contAux++;
        }

        return vertical;
    }

    public ArrayList<String[]> getHT(ArrayList<Photo> photos) {
        ArrayList<String[]> horizontal = new ArrayList<String[]>();

        for (int i = 0; i < photos.size(); i++) {
            if (!photos.pos) {
                horizontal.add(photos.tags);
            }
        }

        return horizontal;
    }

    public ArrayList<String[]> getHP(ArrayList<Photo> photos) {
        int cont = 0;
        int contAux = 0;
        for (int i = 0; i < photos.size(); i++) {
            if (!photos.pos) {
                cont++;
            }
        }

        int[] horizontal = new int[cont];

        for (i = 0; i < photos.size() && contAux < cont; i++) {
            if (photos.pos) {
                horizontal[contAux] = i;
            }
            contAux++;
        }

        return horizontal;
    }
}