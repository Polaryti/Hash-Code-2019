public class Photo {
    public boolean tipo;
    public String[] tags;
    public Integer[] pos;

    public Photo(String p, int n, String[] ar, int cont) {
        if (p.equals("H")) {
            tipo = false;
        } else {
            tipo = true;
        }

        tags = new String[n];
        for (int k = 0; k < n; k++) {
            tags[k] = ar[k];
        }

        pos = new Integer[2];
        pos[0] = new Integer(cont);
    } 

    public Photo(String p, int p1, int p2, String[] etiquetas){
        if (p.equals("H")) {
            tipo = false;
        } else {
            tipo = true;
        }
        pos = new Integer[2];
        pos[0] = p1;
        pos[1] = p2;

        tags = new String[etiquetas.length];
        for (int k = 0; k < etiquetas.length; k++) {
            tags[k] = etiquetas[k];
        }

    }

    public void setX(int x) {
        pos[0] = x;
    }

    public void setY(int y) {
        pos[1] = y;
    }

    public void toStrin() {
        System.out.println(tags.length);
    }
}