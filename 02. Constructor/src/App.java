
//! class tanpa constructor / class polos
class Polos {
    String dataString;
    int dataInteger;
}

// ! class dengan constructor
class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;

    // ! constructor dipanggil saat object pertama kali dibuat
    // Mahasiswa(){
    // System.out.println("ini adalah constructor");
    // }

    // ! constructor dengan parameter || nama constructor harus sama dengan nama
    // class
    Mahasiswa(String inputNama, String inputNIM, String inputJurusan) {
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");
        Mahasiswa mahasiswa1 = new Mahasiswa("KLaz", "123210009", "Informatika");
        System.out.println();
        Mahasiswa mahasiswa2 = new Mahasiswa("Gara", "123210024", "Informatika");

        // Polos objectPolos = new Polos();
        // objectPolos.dataString = "polos";
        // objectPolos.dataInteger = 0;

        // System.out.println(objectPolos.dataString);
        // System.out.println(objectPolos.dataInteger);

        System.out.println("\n");
    }
}
