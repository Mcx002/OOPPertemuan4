public class Truk extends Mobil{
    int bebanAngkutan;
    Ukuran ukuran;
    Jenis jenis;

    public void addSpek(Ukuran ukuran, Jenis jenis){
        this.ukuran = ukuran;
        this.jenis = jenis;
    }

    public void setBebanAngkutan(int bebanAngkutan) {
        this.bebanAngkutan = bebanAngkutan;
    }

    public void displaySpek(){
        System.out.println("Truk jenis "+this.jenis.jenis+ " dengan kapasitas "+this.jenis.kapasitas);
        System.out.println("Mempunyai ukuran:");
        System.out.println("Panjang: "+this.ukuran.panjang);
        System.out.println("Lebar  : "+this.ukuran.lebar);
        System.out.println("Tinggi : "+this.ukuran.tinggi);
    }

    public static class Ukuran{
        double panjang, lebar, tinggi;

        public Ukuran(double panjang, double lebar, double tinggi) {
            this.panjang = panjang;
            this.lebar = lebar;
            this.tinggi = tinggi;
        }
    }
    public static class Jenis{
        String jenis;
        int kapasitas;

        public Jenis(String jenis, int kapasitas) {
            this.jenis = jenis;
            this.kapasitas = kapasitas;
        }
    }
}
