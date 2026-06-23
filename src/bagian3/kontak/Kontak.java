package bagian3.kontak;

public class Kontak {
    // Atribut: data yang dimiliki setiap kontak
    private String nama;
    private String nomor;
    private String email; // Atribut baru

    // Constructor: dipanggil saat objek dibuat
    public Kontak(String nama, String nomor, String email) {
        this.nama = nama;
        this.nomor = nomor;
        this.email = email;
    }

    // Getter: cara membaca atribut dari luar class
    public String getNama() {
        return nama;
    }

    public String getNomor() {
        return nomor;
    }

    public String getEmail() {
        return email;
    }

    // Mengubah objek menjadi satu baris teks untuk disimpan ke berkas (3 bagian dipisah ';')
    public String keBaris() {
        return nama + ";" + nomor + ";" + email;
    }

    // Mengembalikan keterangan kontak dalam bentuk teks
    public String info() {
        return nama + " - " + nomor + " (" + email + ")";
    }
}