public class tambah {
    public static void main(String[] args) {
        int[] angka = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = 0;

        for(int j : angka) {
            total += j;
        }

        System.out.println("Tambah : " + total);
    }
}
