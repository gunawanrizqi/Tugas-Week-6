package firstProgram;

public class fungsi {
    public static void main(String[] args) {
        int x = 2;
        int y = 2;
        int z = 10;

        tambah(x,y);
        tambah(x,z);
        tambah(y,z);
    }
    public static void tambah(int a, int b) {
        int hasilTambah = a+b;
        System.out.println("Hasil tambah "+a+" dan "+b+" adalah :" + hasilTambah);
    }
}

