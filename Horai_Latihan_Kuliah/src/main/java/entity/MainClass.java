package entity;


public class MainClass {
    public static void main(String[] args) {
        ponsel p = new ponsel();
        p.merk  = "IPhone";
        p.harga = "Rp15.000.000,00";
        p.warna = "Putih";
        p.tampilkanData();
        
        ponsel l = new ponsel();
        l.merk  = "Apple";
        l.harga = "Rp17.500.000,00";
        l.warna = "Hitam";
        l.tampilkanData();
    }
}
