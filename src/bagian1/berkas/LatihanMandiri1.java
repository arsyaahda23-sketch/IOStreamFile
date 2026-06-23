package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri1 {
    public static void main(String[] args) {
        
        // ==========================================
        // 1. Latihan Mandiri 1: Cek File 'laporan.txt'
        // ==========================================
        System.out.println("--- SOAL 1 ---");
        File fileLaporan = new File("laporan.txt");
        
        if (fileLaporan.exists()) {
            System.out.println("Berkas 'laporan.txt' DITEMUKAN.");
            System.out.println("Ukuran berkas: " + fileLaporan.length() + " byte");
        } else {
            System.out.println("Berkas 'laporan.txt' TIDAK ditemukan.");
        }
        
        System.out.println(); // Spasi baris

        // ==========================================
        // 2. Latihan Mandiri 2: Buat Folder 'arsip'
        // ==========================================
        System.out.println("--- SOAL 2 ---");
        File folderArsip = new File("arsip");
        
        // Memanggil method mkdir() yang mengembalikan nilai boolean
        boolean isFolderCreated = folderArsip.mkdir();
        
        if (isFolderCreated) {
            System.out.println("Berhasil: Folder 'arsip' telah dibuat.");
        } else {
            System.out.println("Gagal: Folder 'arsip' gagal dibuat (mungkin sudah ada).");
        }
        
        System.out.println(); // Spasi baris

        // ==========================================
        // 3. Latihan Mandiri 3: File Sementara
        // ==========================================
        System.out.println("--- SOAL 3 ---");
        File fileSementara = new File("sementara.txt");
        
        try {
            // Membuat berkas fisik baru
            if (fileSementara.createNewFile()) {
                System.out.println("Berkas 'sementara.txt' berhasil dibuat.");
            }
            
            // Tampilkan status keberadaan SEBELUM dihapus
            System.out.println("Status keberadaan sebelum dihapus: " + fileSementara.exists());
            
            // Menghapus berkas menggunakan method delete()
            if (fileSementara.delete()) {
                System.out.println("Berkas 'sementara.txt' berhasil dihapus.");
            } else {
                System.out.println("Gagal menghapus berkas.");
            }
            
            // Tampilkan status keberadaan SESUDAH dihapus
            System.out.println("Status keberadaan sesudah dihapus: " + fileSementara.exists());
            
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan I/O: " + e.getMessage());
        }
    }
}
