public class Main {

    static void search(int[] h, int x) {
        int hasil = -1;
        for(int i=0; i<h.length; i++) {
            if(h[i] == x) {
                hasil = i;
                break;
            }
        }
        if(hasil == -1) System.out.println("beri hadiah lain");
        else System.out.println(hasil);
    }

    public static void main(String[] args) {
        int[] h = {33, 42, 32, 39, 40};
        int x = 40;
        search(h, x);
    }
}