public class Main {

    public static void main(String[] args) {



            segitiga main1 = new segitiga(3,4);
            persegi main2 = new persegi(4);
            persegipanjang main3 = new persegipanjang(7,8);

            System.out.println("Luas");
            System.out.println("Persegi : " + main2.hitungLuaspersegi());
            System.out.println("Segitiga : " + main1.hitungLuassegitiga());
            System.out.println("Persegi Panjang : " + main3.hitungLuaspersegipanjang());

            System.out.println();
            System.out.println("Keliling");
            System.out.println("Persegi : " + main2.hitungKelilingpersegi());
            System.out.println("Segitiga : " + main1.hitungKelilingsegitiga());
            System.out.println("Persegi Panjang : " + main3.hitungKelilingpersegipanjang());
    }
}