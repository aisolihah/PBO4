abstract class Buah {

    protected String nama;

    public abstract void cetakInformasi();

    public void tampilkanWarna() {
        System.out.println("Warna buah: ...");
    }
}

class Apel extends Buah {

    public Apel(String nama) {
        this.nama = nama;
    }

    @Override
    public void cetakInformasi() {
        System.out.println("Nama buah: " + nama);
        System.out.println("Jenis buah: Apel");
    }

    @Override
    public void tampilkanWarna() {
        System.out.println("Warna: Merah");
    }
}

class Pisang extends Buah {

    public Pisang(String nama) {
        this.nama = nama;
    }

    @Override
    public void cetakInformasi() {
        System.out.println("Nama buah: " + nama);
        System.out.println("Jenis buah: Pisang");
    }

    @Override
    public void tampilkanWarna() {
        System.out.println("Warna: Kuning");
    }
}

public class Main {

    public static void main(String[] args) {
        Buah apel = new Apel("Manalagi");
        apel.cetakInformasi();
        apel.tampilkanWarna();

        Buah pisang = new Pisang("Ambon");
        pisang.cetakInformasi();
        pisang.tampilkanWarna();
    }
}
