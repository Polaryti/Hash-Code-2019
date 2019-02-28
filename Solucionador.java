import java.io.FileNotFoundException;
import java.util.LinkedList;

public class Solucionador {
    private int p = 0;

    public static void main(String[] args) throws FileNotFoundException {
        for (int i = 0; i < 10000; i++) {
            LinkedList<Photo> aux = Generador.devArL();
            LinkedList<Photo> aux2 = Separador.merge(Separador.getH(aux), Verticales.juntar(aux));
            int point = ContadorPuntos.contador(aux2);
            if (point > p) {
                GeneradorRes.gen(aux2);
            }
        }
    }
}