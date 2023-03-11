package tutorial;

class Mahasiswa {
    // ! Data member
    String nama; // ? yg di panggil jika make thiis
    String NIM;

    // ! constructor
    Mahasiswa(String nama, String NIM) {
        // ? this ini adalah langasung memanggil si objeknya : String nama
        this.nama = nama;
        this.NIM = NIM;
    }

    // ! method tanpa return dan tanpa parameter
    void show() {
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM  : " + this.NIM);
    }

    // ! method tanpa return dan dengan parameter
    void setNama(String nama) {
        this.nama = nama;
    }

    // ! method dengan return tapi tidak ada parameter
    String getNama() {
        return this.nama;
    }

    String getNIM() {
        return this.NIM;
    }

    // ! method dengan return dan dengan parameter
    String sayHi(String message) {
        return message + " juga, nama saya adalah " + this.nama;
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("ucup", "13305041");
        // ? mahasiswa1.nama (pada method main) == this.nama (pada class Mahasiswa)
        // ! method
        mahasiswa1.show();
        mahasiswa1.setNama("tutung");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        String data = mahasiswa1.sayHi("ganteng");
        System.out.println(data);
    }
}