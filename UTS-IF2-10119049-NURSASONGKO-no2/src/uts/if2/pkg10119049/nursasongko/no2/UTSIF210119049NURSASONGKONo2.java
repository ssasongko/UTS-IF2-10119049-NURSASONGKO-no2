package uts.if2.pkg10119049.nursasongko.no2;

import java.util.Scanner;

/**
 * @author
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : Program ATM / penarikan uang
**/
public class UTSIF210119049NURSASONGKONo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // object scanner
        int tarikSaldo;
        
        System.out.printf("======PROGRAM PENARIKAN UANG========\n");
        System.out.printf("Masukkan Saldo Awal : ");
        Tabungan t1 = new Tabungan(scan.nextInt());
        System.out.printf("Jumlah uang yang diambil : ");
        tarikSaldo = scan.nextInt();
        System.out.printf("Saldo Anda Sekarang : %d\n",t1.ambilUang(tarikSaldo));
        
    }
    
}
