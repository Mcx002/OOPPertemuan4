public class Kendaraan {
    int id;
    int jumlahRoda;
    int bentukSetir;

    public void setJumlahRoda(int jumlahRoda) {
        this.jumlahRoda = jumlahRoda;
    }
    public void setId(int id){
        this.id = id;
    }

    void maju(){
        System.out.println("maju");
    }
    void belokKanan(){
        System.out.println("belok kanan");
    }
    void belokKiri(){
        System.out.println("belok kiri");
    }
}
