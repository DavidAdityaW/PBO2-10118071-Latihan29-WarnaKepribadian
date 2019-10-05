/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan29.warnakepribadian;
// package scanner
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menentukan
 *                     kepribadian seseorang dari warna sesuai ketentuan  
 * 
 */
public class PBO210118071Latihan29WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static final String RESET = "\u001b[0m";
    public static final String HITAM = "\u001b[30m";
    public static final String MERAH = "\u001b[31m";
    public static final String HIJAU = "\u001b[32m";
    public static final String KUNING = "\u001b[33m";
    public static final String BIRU = "\u001b[34m";
    public static final String UNGU = "\u001b[35m";
    public static final String CYAN = "\u001b[36m";
    public static final String PUTIH = "\u001b[37m";
    
    public static final String MERAHBG = "\u001b[41m";
    public static final String HIJAUBG= "\u001b[42m";
    public static final String KUNINGBG = "\u001b[43m";
    public static final String BIRUBG = "\u001b[44m";
    public static final String UNGUBG = "\u001b[45m";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(MERAH + "YUK" + HIJAU + " CEK " + KUNING + "KEPRIBADIANMU " + CYAN + "DARI " + UNGU + "WARNA " + BIRU + "FAVORITMU" + RESET);
        
        System.out.println(MERAHBG + "\tMERAH\t\t" + RESET);
        System.out.println(HIJAUBG + "\tHIJAU\t\t" + RESET);
        System.out.println(KUNINGBG + "\tKUNING\t\t" + RESET);
        System.out.println(BIRUBG + "\tBIRU\t\t" + RESET);
        System.out.println(UNGUBG + "\tUNGU\t\t" + RESET);
        
        System.out.print("\nPILIH WARNA FAVORITMU : ");
        String warna = input.next();
        System.out.print("NAMA KAMU : ");
        String nama = input.next();
        
        warna = warna.toUpperCase();
        nama = nama.toUpperCase();
        
        if (warna.equals("MERAH")) {
            System.out.println("===HASIL TEST KEPRIBADIAN " + nama + "===");
            System.out.println("Warna Favoritmu adalah " + MERAH + "MERAH");
            System.out.println("1. Periang,");
            System.out.println("2. Pemberani,");
            System.out.println("3. Berani mengambil resiko dalam setiap langkah,");
            System.out.println("4. Menyukai tantangan,");
            System.out.println("5. Kurang sabar,");
            System.out.println("6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol,");
            System.out.println("7. Memiliki energi kehangatan dan cinta.");
        } else if (warna.equals("HIJAU")) {
            System.out.println("===HASIL TEST KEPRIBADIAN " + nama + "===");
            System.out.println("Warna Favoritmu adalah " + HIJAU + "HIJAU");
            System.out.println("1. Romantis,");
            System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
            System.out.println("3. Teguh pada prinsip,");
            System.out.println("4. Menginginkan kesempurnaan,");
            System.out.println("5. Mudah cemburu,");
            System.out.println("6. Mudah merasa iri,");
            System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
        } else if (warna.equals("KUNING")) {
            System.out.println("===HASIL TEST KEPRIBADIAN " + nama + "===");
            System.out.println("Warna Favoritmu adalah " + KUNING + "KUNING");
            System.out.println("1. Optimis,");
            System.out.println("2. Suka bergaul,");
            System.out.println("3. Periang,");
            System.out.println("4. Senang menolong,");
            System.out.println("5. Lincah dan aktif,");
            System.out.println("6. Tidak suka meremehkan kekurangan orang lain,");
            System.out.println("7. Loyal,");
            System.out.println("8. Hangat,");
            System.out.println("9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,");
            System.out.println("10. Cenderung penakut.");
        } else if (warna.equals("BIRU")) {
            System.out.println("===HASIL TEST KEPRIBADIAN " + nama + "===");
            System.out.println("Warna Favoritmu adalah " + BIRU + "BIRU");
            System.out.println("1. Menyenangkan,");
            System.out.println("2. Bijaksana,");
            System.out.println("3. Pembawaan diri tenang saat menghadapi masalah");
            System.out.println("4. Dinamis,");
            System.out.println("5. Senang berbagi,");
            System.out.println("6. Bersahabat,");
            System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang,");
            System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");
        } else if (warna.equals("UNGU")){
            System.out.println("===HASIL TEST KEPRIBADIAN " + nama + "===");
            System.out.println("Warna Favoritmu adalah " + UNGU + "UNGU");
            System.out.println("1. Optimis,");
            System.out.println("2. Tidak pernah ragu,");
            System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
            System.out.println("4. Memiliki ambisi yang besar,");
            System.out.println("5. Memiliki empati yang besar,");
            System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,");
            System.out.println("7. Terkadang bersikap keras kepala dan angkuh.");
        } else {
            System.out.println("===HASIL TEST KEPRIBADIAN " + nama + "===");
            System.out.println("Oops.. Belum teridentifikasi");
        }
    }
    
}
