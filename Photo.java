public class Photo {
    public boolean tipo;
    public String[] tags;

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
    } 

    public void toStrin() {
        System.out.println(tags.length);
    }
}