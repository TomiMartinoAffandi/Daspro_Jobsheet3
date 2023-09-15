/**
 * contohvariable27
 */
public class ContohVariable27 {

    public static void main(String[] args) {
        String identiatsMahasiswa = "Mahasiswa A";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte _umurSayaSekarang = 20;
        double $ipk = 3.24, tinggi = 1.78;

        System.out.println(identiatsMahasiswa);
        System.out.println("Apakah pandai" + isPandai);
        System.out.println("Jenis Kelamin" + jenisKelamin);
        System.out.println("Umurku saat ini" + _umurSayaSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", $ipk, tinggi));
    }
}