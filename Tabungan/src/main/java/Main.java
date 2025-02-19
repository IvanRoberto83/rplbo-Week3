public class Main {
    public static void main(String[] args) {
        Tabungan t1 = new Tabungan();
        System.out.println("Saldo t1 Sebelum: "+t1.printSaldo());
        t1.penyetoran(200000);
        System.out.println("Saldo t1 Sesudah: "+t1.printSaldo());
        System.out.println();

        Nasabah n1 = new Nasabah("1","Ivan","Jalan Jawa");
        Nasabah n2 = new Nasabah("2","Anton","Jalan Jawa");
        Tabungan t2 = new Tabungan(n1);
        t2.printNasabah();
        System.out.println("Saldo t2 Sebelum: "+t2.printSaldo());
        t2.penyetoran(1000000);
        t2.penarikan(100000);
        System.out.println("Saldo t2 Setelah: "+t2.printSaldo());
        System.out.println();

        Tabungan t3 = new Tabungan(new Nasabah("3","Niel","Jalan Jawa"));
        t3.printNasabah();
        System.out.println("Saldo t3 Sebelum: "+t3.printSaldo());
        t3.penyetoran(100000);
        t3.penarikan(300000);
        System.out.println("Saldo t3 Setelah: "+t3.printSaldo());
        System.out.println();

        Tabungan t4 = new Tabungan(n2,200000);
        t4.printNasabah();
        System.out.println("Saldo t4 Sebelum: "+t4.printSaldo());
    }
}
