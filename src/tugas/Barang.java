package tugas;

public class Barang {
    // Atribut barang
    private String nama;
    private double harga;
    private int stok;

    // Constructor
    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // Mengubah data objek menjadi format satu baris teks untuk disimpan ke file
    public String keBaris() {
        return nama + ";" + harga + ";" + stok;
    }

    // Mengembalikan informasi lengkap mengenai barang
    public String info() {
        return nama + " - Rp" + harga + " (Stok: " + stok + ")";
    }
}