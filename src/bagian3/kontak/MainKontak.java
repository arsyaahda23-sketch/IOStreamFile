package bagian3.kontak;

public class MainKontak {

  public static void main(String[] args) {
        String namaBerkas = "kontak_baru.txt";
        BukuKontak buku = new BukuKontak(namaBerkas);

        System.out.println("=== TAHAP 1: Menyiapkan Data Awal ===");
        buku.tambahKontak(new Kontak("Budi", "08123456789", "budi@email.com"));
        buku.tambahKontak(new Kontak("Andi", "08987654321", "andi@mail.com"));
        buku.tambahKontak(new Kontak("Siti", "08551122334", "siti@xyz.com"));
        buku.simpanKeBerkas();
        System.out.println("\n-----------------------------------------------\n");


        System.out.println("=== TAHAP 2: Pengujian Fitur Hapus ===");
        // Menampilkan data sebelum dihapus
        System.out.println("[Sebelum Dihapus]");
        buku.tampilkanSemua();
        System.out.println();

        // Mencoba menghapus kontak bernama "Andi"
        buku.hapusKontak("Andi");
        System.out.println();

        // Menampilkan data setelah dihapus untuk melihat perubahan di memori
        System.out.println("[Setelah Dihapus]");
        buku.tampilkanSemua();
        System.out.println("\n-----------------------------------------------\n");


        System.out.println("=== TAHAP 3: Validasi File Fisik ===");
        // Kita buat objek baru dan muat dari berkas untuk memastikan 
        // file 'kontak_baru.txt' benar-benar sudah ter-update secara permanen
        BukuKontak bukuValidasi = new BukuKontak(namaBerkas);
        bukuValidasi.muatDariBerkas();
        bukuValidasi.tampilkanSemua();
    }
}