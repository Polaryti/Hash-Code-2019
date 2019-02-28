import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * ContadorPuntos
 */
public class ContadorPuntos {
    public static int contador(LinkedList<Photo> list) {
        String[] inter;
        int res = 0;
        int contI1;
        int contI2;
        for (int i = 0; i < list.size() - 1; i++) {
            inter = ContadorPuntos.intersection(list.get(i + 1).tags, list.get(i).tags);
            contI1 = ContadorPuntos.contD(list.get(i + 1).tags, inter);
            contI2 = ContadorPuntos.contD(list.get(i).tags, inter);
            if (inter.length >= contI1) {
                if (inter.length >= contI2) {
                    res += inter.length;
                } else {res += contI2;}
            } else {
                if (contI1 >= contI2) res += contI1;
                else res += contI2;
            }
        }
        return res;
    }

    private static int contD(String[] inter1, String[] inter2) {
        int cont = 0;
        for (int i = 0; i < inter1.length; i++) {
            for (int j = 0; i < inter2.length; i++) {
                if (!inter1[i].equals(inter2[j])) {
                    cont++;
                }
            }
        }
        return cont;
    }

    private static String[] intersection(String[] inter1, String[] inter2) {
        String[] res;
        if (inter1.length >= inter2.length) { res = new String[inter2.length]; }
        else { res = new String[inter1.length]; }
        int cont = 0;
        
        for (int i = 0; i < inter1.length; i++) {
            for (int j = 0; i < inter2.length; i++) {
                if (inter1[i].equals(inter2[j])) {
                    res[cont] = inter1[i];
                    cont++;
                }
            }
        }
        String[] res2 = new String[cont];
        for (int i = 0; i < cont; i++) {
            res2[i] = res[i];
        }
        return res2;
    }
}