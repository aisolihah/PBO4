public class Buah {

    protected String nama;

    public static double hitungHarga(double jumlah, double hargaPerKg) {
        return jumlah * hargaPerKg;
    }

    public static double hitungHarga(int jumlah, double hargaPerBuah) {
        return jumlah * hargaPerBuah;
    }

    public static void main(String[] args) {
        System.out.println("Harga 2 kg apel (Rp 10.000/kg): " + hitungHarga(2, 10000));
        System.out.println("Harga 5 jeruk (Rp 2.500/buah): " + hitungHarga(5, 2500));
    }
}
