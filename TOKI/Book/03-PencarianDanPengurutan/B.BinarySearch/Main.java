public class Main {

    static void binarySearch(int[] h, int x) {
        int hasil = -1;
        int kiri = 0;
        int kanan = h.length-1;
        while(kiri <= kanan && hasil == -1) {
            int tengah = (kiri + kanan) / 2;
            if(x < h[tengah]) {
                kanan = tengah - 1;
            }else if(x > h[tengah]) {
                kiri = tengah + 1;
            }else {
                hasil = tengah;
            }
        }

        if(hasil == -1) System.out.println("beri hadiah lain");
        else System.out.println(hasil);
    }

    public static void main(String[] args) {
        int[] h = {31, 32, 33, 34, 35};
        int x = 32;
        binarySearch(h, x);
    }
}