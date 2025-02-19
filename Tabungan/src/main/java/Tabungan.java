public class Tabungan {
    private Nasabah nasabah;
    private double saldo;

    public Tabungan() {
    }

    public Tabungan(Nasabah nasabah, double saldo) {
        this.nasabah = nasabah;
        this.saldo = saldo;
    }

    public Tabungan(String noIdentitas, String nama, String alamat, double saldo){
        this.nasabah = new Nasabah(noIdentitas,nama,alamat);
        this.saldo = saldo;
    }

    public Tabungan(Nasabah nasabah){
        this(nasabah,0);
    }

    public void penyetoran(double uang){
        if(uang > 0){
            this.saldo = this.saldo + uang;
        }
    }

    public void penarikan(double uang){
        if(uang > 0 && uang <= saldo){
            this.saldo = this.saldo - uang;
        }
    }

    public double printSaldo(){
        return this.saldo;
    }

    public void printNasabah(){
        System.out.println("ID: "+this.nasabah.getNoIdentitas());
        System.out.println("Nama: "+this.nasabah.getNama());
        System.out.println("Alamat: "+this.nasabah.getAlamat());
    }
}
