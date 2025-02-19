public class Nasabah {
    private String noIdentitas;
    private String nama;
    private String alamat;

    public Nasabah(String noIdentitas, String nama, String alamat) {
        this.noIdentitas = noIdentitas;
        this.nama = nama;
        this.alamat = alamat;
    }

    public Nasabah() {
    }

    public String getNoIdentitas() {
        return noIdentitas;
    }

    public void setNoIdentitas(String noIdentitas) {
        this.noIdentitas = noIdentitas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
