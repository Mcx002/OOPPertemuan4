public class Main {
    public static void main(String[] args){
        Kendaraan kendaraan = new SepedaMotor();
        kendaraan.setJumlahRoda(2);
        System.out.println("Jumlah roda kendaraan ini adalah: "+kendaraan.jumlahRoda);
        kendaraan.belokKanan();

        Kendaraan roda4 = new Kendaraan();
        roda4.setJumlahRoda(4);
        roda4.setId(1);
        Mobil mobil = new Mobil();
        mobil.setKendaraanId(roda4.id); // nah ini asosiasi
        mobil.setJumlahRoda(4);
        System.out.println("Jumlah roda kendaraan ini adalah: "+mobil.jumlahRoda);
        mobil.maju();
        mobil.mundur();
        mobil.belokKiri();

        MobilPenumpang mobilPenumpang = new MobilPenumpang();
        mobilPenumpang.setJumlahPenumpang(15);
        mobilPenumpang.setBesarBagasi(12);
        mobilPenumpang.setJumlahAirBag(4);
        Penumpang penumpang1 = new Penumpang(1,"jhonny", "L");
        Penumpang penumpang2 = new Penumpang(2, "Jojo", "L");
        Penumpang penumpang3 = new Penumpang(3, "Siti", "L");
        mobilPenumpang.addPenumpang(penumpang1);
        mobilPenumpang.addPenumpang(penumpang2); // ini agregasi
        mobilPenumpang.addPenumpang(penumpang3);
        System.out.println("Mobil ini adalah mobil penumpang, dengan penumpang "+mobilPenumpang.jumlahPenumpang+", dengan besar" +
                "bagasi "+ mobilPenumpang.besarBagasi+" dan jumlah air bag "+mobilPenumpang.jumlahAirBag+". sekarang mobilnya sedang ");
        System.out.println("\nList Penumpang:");
        mobilPenumpang.displayPenumpang();

        mobilPenumpang.belokKanan();
        Truk truk = new Truk();
        truk.addSpek(new Truk.Ukuran(2.3, 1.5, 1.2), new Truk.Jenis("Pick Up", 1)); // ini komposisi
        truk.setBebanAngkutan(20);
        System.out.println("disana ada truk yang menampung beban "+truk.bebanAngkutan+"kg, dan dia sedang ");
        truk.belokKiri();
        truk.displaySpek();
    }
}
