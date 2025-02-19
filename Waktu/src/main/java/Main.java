public class Main {
    public static void main(String[] args) {
        Waktu w1 = new Waktu(10,0,0);
        Waktu w2 = new Waktu(12,0,0);
        Waktu w3 = new Waktu(w2);

        System.out.print(w2.selisih(w1)+" detik atau ");
        System.out.print(w2.selisih(w1)/60+" menit atau ");
        System.out.println(w2.selisih(w1)/3600+" jam");
    }
}
