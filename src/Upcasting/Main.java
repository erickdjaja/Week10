public class Main {

    public static void main(String[] args) {

        Pekerja pekerja = new Pekerja();
        pekerja.tanyaIdentitas();

        pekerja = new CEO();                 // upcasting
        pekerja.tanyaIdentitas();

        Karyawan karyawan = new Karyawan();
        pekerja = (Pekerja) karyawan;        // upcasting
        pekerja.tanyaIdentitas();
    }
}