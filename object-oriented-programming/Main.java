public class Main {
    public static void main(String[] args) {

        Penjumlahan penjumlahan = new Penjumlahan();
        Pengurangan pengurangan = new Pengurangan();
        Perkalian perkalian = new Perkalian();
        Pembagian pembagian = new Pembagian();

        penjumlahan.setNumber(3, 4);
        pengurangan.setNumber(15,4);
        perkalian.setNumber(10,10);
        pembagian.setNumber(12, 3);

        System.out.println("Penjumlahan : " + penjumlahan.penjumlahan());
        System.out.println("Pengurangan : " + pengurangan.pengurangan());
        System.out.println("Perkalian : " + perkalian.perkalian());
        System.out.println("Pembagian : " + pembagian.pembagian());

    }
}