public class MobilPenumpang extends Mobil{
    int jumlahPenumpang, jumlahAirBag, besarBagasi;
    Penumpang[] penumpang = new Penumpang[12];
    private int lastidx = 0;

    public void setJumlahPenumpang(int jumlahPenumpang) {
        this.jumlahPenumpang = jumlahPenumpang;
    }

    public void setJumlahAirBag(int jumlahAirBag) {
        this.jumlahAirBag = jumlahAirBag;
    }

    public void setBesarBagasi(int besarBagasi) {
        this.besarBagasi = besarBagasi;
    }

    public void addPenumpang(Penumpang penumpang){
        this.penumpang[lastidx++] = penumpang;
    }

    public void displayPenumpang(){
        for(Penumpang penumpang: this.penumpang){
            if(penumpang!=null)
                System.out.println(penumpang.id+". Nama: "+penumpang.nama+", Gender: "+penumpang.gender);
        }
    }
}
