class Buku {
    String judul;
    String penulis;

    Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    void display() {
        System.out.println("\nJudul\t: " + this.judul);
        System.out.println("Penulis\t: " + this.penulis);
    }
}

public class App {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Harry Potter", "Kurang Tahu");
        buku1.display();

        // ! Menampilkan address
        String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println("Address buku 1 : " + addressBuku1);

        // ! assignment object
        Buku buku2 = buku1;
        buku2.display();
        String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println("Address buku 2 : " + addressBuku2);

        // ! karena buku1 dan buku2 berada pada address atau referensi yang sama
        System.out.println("\n-----------\nNgetes 1");
        buku2.judul = "Harry Maguire";
        buku1.display();
        buku2.display();

        // ! kita akan memasukan object kedalam methods
        System.out.println("\n-----------\nNgetes 2");
        fungsi(buku2);
        buku1.display();
        buku2.display();
    }

    public static void fungsi(Buku dataBuku) {
        String addressDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("address dalam fungsi " + addressDataBuku);
        dataBuku.penulis = "Munyuk";
    }
}
