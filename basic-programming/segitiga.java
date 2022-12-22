public class segitiga {
    int alas ;
    int tinggi ;

    public segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int hitungLuassegitiga(){

        return this.alas*this.tinggi /2;
    }

    public int hitungKelilingsegitiga(){
        double sisia = Math.pow(this.alas, 2);
        double sisib = Math.pow(this.tinggi, 2);
        double sisi = Math.sqrt(sisia+sisib);
        return (int) (this.alas+this.tinggi+sisi);
    }
}
class persegi {
    int sisi;

    public persegi(int sisi) {
        this.sisi = sisi;
    }

    public int hitungLuaspersegi() {
        return this.sisi * this.sisi;
    }

    public int hitungKelilingpersegi() {
        return this.sisi * 4;
    }
}
    class persegipanjang {
        int panjang ;
        int lebar;

        public persegipanjang(int panjang, int lebar) {
            this.panjang = panjang;
            this.lebar = lebar;
        }

        public int hitungLuaspersegipanjang(){
            return this.panjang*this.lebar;
        }

        public int hitungKelilingpersegipanjang(){
            return 2*(this.panjang+this.lebar);
        }
}
