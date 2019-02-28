public class Photo {
    public boolean tipo;
    public String[] tags;
    public int[] pos;

    public Photo(String p, int n, String[] ar) {
        if (p.equals("H")) {
            tipo = false;
        } else {
            tipo = true;
        }

        tags = new String[n];
        for (int k = 0; k < n; k++) {
            tags[k] = ar[k];
        }

        pos = new int[2];
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