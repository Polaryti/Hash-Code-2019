import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedList;;

public class GeneradorRes {
    private static final File FILE_OUT = new File("a_example_out.txt");

    public static void gen(LinkedList<Photo> aP) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(FILE_OUT);
        int i = aP.size();
        pw.println(i);
        for (int c = 0; c < i; c++) {
        Photo ph = aP.remove();
        int x = ph.pos[0];
        int y = ph.pos[1];
        //if (x != null) {
            pw.print(x);
        //} else if (y != null) {
            pw.print(y);
        //}
        pw.println();
        }
        pw.close();
        
    }
    
}