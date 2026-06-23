package bagian2.bacatulis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LatihanMandiri2 {
    public static void main(String[] args) {
        String namaFile = "hari.txt";

        // =========================================================================
        // 1. Tulis 5 nama hari ke hari.txt, lalu baca kembali dan tampilkan ke layar
        // =========================================================================
        System.out.println("--- SOAL 1: Menulis 5 Hari awal dan Membacanya ---");
        
        // Menulis 5 hari awal
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(namaFile))) {
            String[] hariAwal = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
            for (String hari : hariAwal) {
                writer.write(hari);
                writer.newLine(); // Membuat baris baru
            }
            System.out.println("Berhasil menulis 5 nama hari ke " + namaFile + ".\n");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis berkas: " + e.getMessage());
        }

        // Membaca kembali hasil tulisan pertama
        System.out.println("Isi berkas " + namaFile + " saat ini:");
        bacaDanTampilkanFile(namaFile);
        System.out.println(); // Spasi antar nomor


        // =========================================================================
        // 2. Tambahkan (append) 2 nama hari lagi tanpa menghapus isi sebelumnya
        // =========================================================================
        System.out.println("--- SOAL 2: Menambahkan (Append) 2 Hari Lagi ---");
        
        // Parameter 'true' pada FileWriter mengaktifkan mode APPEND (tambah data)
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(namaFile, true))) {
            String[] hariTambahan = {"Sabtu", "Minggu"};
            for (String hari : hariTambahan) {
                writer.write(hari);
                writer.newLine();
            }
            System.out.println("Berhasil menambahkan 2 nama hari ke " + namaFile + ".\n");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menambah data: " + e.getMessage());
        }

        // Menampilkan seluruh isinya setelah di-append
        System.out.println("Isi seluruh berkas " + namaFile + " setelah ditambah:");
        bacaDanTampilkanFile(namaFile);
        System.out.println();


        // =========================================================================
        // 3. Baca berkas hari.txt lalu hitung dan tampilkan jumlah barisnya
        // =========================================================================
        System.out.println("--- SOAL 3: Menghitung Jumlah Baris ---");
        
        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            int jumlahBaris = 0;
            while (reader.readLine() != null) {
                jumlahBaris++;
            }
            System.out.println("Banyaknya baris yang ada di dalam berkas '" + namaFile + "' adalah: " + jumlahBaris);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menghitung baris: " + e.getMessage());
        }
    }

    /**
     * Helper method untuk membaca berkas teks baris demi baris dan mencetaknya ke konsol.
     */
    private static void bacaDanTampilkanFile(String namaFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            String baris;
            while ((baris = reader.readLine()) != null) {
                System.out.println("- " + baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca berkas: " + e.getMessage());
        }
    }
}
