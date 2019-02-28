import java.util.LinkedList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Verticales {
    public Verticales() {}
    public static LinkedList<Photo> juntar(LinkedList<Photo> completa) {
        LinkedList<Photo> resultado = new LinkedList<Photo>();
        LinkedList<Photo> imagenes = Separador.getV(completa);
        while (!imagenes.isEmpty() && imagenes.size() != 1){
            //int i = 1;
            //int max = 0;
            //Photo actual = imagenes.get(0);
            //int parella = 1;
            //while(i < imagenes.size()) {
             //   Photo altra = imagenes.get(i);
            //    int cont = 0;
            //    
            //    for(int j = 0; j < actual.tags.length; j++){
            //       for(int k = 0; k < altra.tags.length; k++) {
            //            if(actual.tags[j].equals(altra.tags[k])){
            //                cont++;
            //            }
            //        }
            //    }
            //    if(cont > max){
            //       max = cont;
            //        parella = i;
            //    }
            //    i++;
            //}
            //Photo altra = imagenes.get(parella);
            Photo creada = new Photo("H", imagenes.get(0).pos[0].intValue(), imagenes.get(1).pos[0].intValue(), union(imagenes.get(0).tags, imagenes.get(1).tags));
            resultado.add(creada);
            //imagenes.remove(parella);
            imagenes.remove(0);
            imagenes.remove(0);
        }
        return resultado;
    }
      
    public static String[] union(String[] array1, String[] array2)
    {
        List<String> list = new LinkedList<String>();
        list.addAll(Arrays.asList(array1));
        list.addAll(Arrays.asList(array2));

        return list.toArray(new String[list.size()]);
    }

}