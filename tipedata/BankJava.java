package tipedata;

import java.util.Scanner;

public class BankJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.close();
        int saldo, jmlUang;
        saldo = 100000;

        System.out.println("Selamat datang di Bank Unan");
        System.out.println("Saldo anda saat ini :" + saldo);
        
        System.out.print("Masukkan nilai uang yang mau anda deposit: Rp. ");
        jmlUang = input.nextInt();
        saldo += jmlUang;
        System.out.println("Saldo saat ini: Rp. " + saldo);

        System.out.println("Masukkan nilai yang yang ingin ada withdraw: Rp. ");
        jmlUang = input.nextInt();
        saldo -= jmlUang;
        System.out.println("Saldo saat ini: Rp. "+ saldo);

        System.out.println("Terima kasih sudah menggunakan layanan kami");
    }
}
