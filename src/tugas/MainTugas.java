//Nama:Ahmad Arsya Zauri Ahda
//NPM:2410010377

package tugas;

public class MainTugas {
    public static void main(String[] args) {
        String fileTarget = "barang.txt";

        // 1. Menyimpan daftar nama kategori dalam sebuah array String (ukuran tetap) dan menampikannya
        System.out.println("=== KATEGORI TOKO ===");
        String[] kategori = {"Elektronik", "Pakaian", "Makanan & Minuman", "Alat Tulis"};
        for (String kat : kategori) {
            System.out.println("- Kategori: " + kat);
        }
        System.out.println("\n------------------------------------------------\n");


        // 2. Membuat objek Gudang pertama dan menambahkan minimal 5 objek Barang
        System.out.println("=== TAHAP 1: Pengisian dan Penyimpanan Data ===");
        Gudang gudangAwal = new Gudang(fileTarget);

        gudangAwal.tambahBarang(new Barang("Laptop Asus", 8500000.0, 5));
        gudangAwal.tambahBarang(new Barang("Mouse Wireless", 150000.0, 20));
        gudangAwal.tambahBarang(new Barang("Keyboard Mekanik", 450000.0, 12));
        gudangAwal.tambahBarang(new Barang("Smartphone Samsung", 3500000.0, 8));
        gudangAwal.tambahBarang(new Barang("Headset Gaming", 600000.0, 15));

        // Menampilkan data awal dan menyimpannya ke berkas teks
        gudangAwal.tampilkanSemua();
        gudangAwal.simpanKeBerkas();
        System.out.println("\n------------------------------------------------\n");


        // 3. Membuat objek Gudang baru untuk membuktikan data termuat kembali dari berkas dengan benar
        System.out.println("=== TAHAP 2: Pembuktian Data Melalui Objek Gudang Baru ===");
        Gudang gudangBaru = new Gudang(fileTarget);

        // Memuat kembali data dari berkas teks
        gudangBaru.muatDariBerkas();
        System.out.println();

        // Menampilkan data hasil muatan berkas
        gudangBaru.tampilkanSemua();
        System.out.println();

        // Menampilkan total nilai persediaan untuk membuktikan data tersimpan dan terhitung
        double totalPersediaan = gudangBaru.totalNilai();
        System.out.println("Total Nilai Persediaan Seluruh Barang: Rp" + totalPersediaan);
    }
}