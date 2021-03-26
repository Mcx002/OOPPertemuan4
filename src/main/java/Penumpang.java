// saya membuat class ini untuk informasi data penumpang yang akan di agregasi kan ke class MobilPenumpang
public class Penumpang {
    int id;
    String nama, gender;

    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Penumpang(int id, String nama, String gender) {
        this.id = id;
        this.nama = nama;
        this.gender = gender;
    }
}
