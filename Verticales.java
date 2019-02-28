import java.util.LinkedList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Verticales {
    public Verticales() {}
    public static LinkedList<Photo> juntar(LinkedList<Photo> completa) {
        LinkedList<Photo> resultado = new LinkedList<Photo>();
        LinkedList<Photo> imagenes = Separador.getV(completa);
        while (!imagenes.isEmpty()){
            int i = 1;
            int min = 1000;
            Photo actual = imagenes.get(0);
            int parella = 0;
            while(i < imagenes.size()) {
                Photo altra = imagenes.get(i);
                int cont = 0;
                
                for(int j = 0; j < actual.tags.length; j++){
                    for(int k = 0; k < altra.tags.length; k++) {
                        if(actual.tags[j] == altra.tags[k]){
                            cont++;
                        }
                    }
                }
                if(cont < min){
                    min = cont;
                    parella = altra.pos[i];
                }
                i++;
            }
            Photo altra = imagenes.get(parella);
            Photo creada = new Photo("H", actual.pos[0].intValue(), altra.pos[0].intValue(), union(actual.tags, altra.tags));
            resultado.add(creada);
            imagenes.remove(parella);
            imagenes.remove(0);
        }
        return resultado;
    }
      
    public static String[] union(String[] array1, String[] array2)
    {
        List<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList(array1));
        list.addAll(Arrays.asList(array2));

        return list.toArray(new String[list.size()]);
    }

}