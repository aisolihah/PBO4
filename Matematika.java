public class Matematika {

    public static double hitung(double a, double b) {
        return a + b;
    }

    public static double hitung(double a, double b, String operasi) {
        switch (operasi) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                return 0;
        }
    }

    public static double hitung(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Penjumlahan: " + hitung(2, 3));
        System.out.println("Pengurangan: " + hitung(5, 2, "-"));
        System.out.println("Perkalian: " + hitung(2, 4, "*"));
        System.out.println("Pembagian: " + hitung(8, 2, "/"));
        System.out.println("Penjumlahan 3 angka: " + hitung(1, 2, 3));
    }
}
