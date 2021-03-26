public class Mobil extends Kendaraan{
    int jumlahPintu, jumlahKursi, panjangMobil, lebarMobil, kendaraanId;

    public void setKendaraanId(int kendaraanId) {
        this.kendaraanId = kendaraanId;
        // nah yang ini asosiasi
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public void setPanjangMobil(int panjangMobil) {
        this.panjangMobil = panjangMobil;
    }

    public void setLebarMobil(int lebarMobil) {
        this.lebarMobil = lebarMobil;
    }

    void mundur(){
        System.out.println("mundur");
    }
}
