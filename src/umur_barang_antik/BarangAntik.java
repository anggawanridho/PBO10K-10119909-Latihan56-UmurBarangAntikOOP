package umur_barang_antik;

/**
 * @author
 * NAMA     : Anggawan Ridho
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class BarangAntik {
    private final int umur;

    public BarangAntik(int umur){
        this.umur = umur;
    }

    public void tampilUmur(){
        System.out.println("Umur barang antik ini adalah : " + this.umur + " tahun");
    }
}
