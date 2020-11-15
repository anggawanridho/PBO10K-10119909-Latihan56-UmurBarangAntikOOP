package umur_barang_antik;

/**
 * @author
 * NAMA     : Anggawan Ridho
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class Radio extends BarangAntik{
    private String name;

    public Radio(int umur){
        super(umur);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
