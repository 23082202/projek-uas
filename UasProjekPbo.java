/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Dimas Rachmat Rizki_630
 */
package uas_projek_pbo;
import java.util.Scanner;

public class UasProjekPbo {
    public static void main(String[] args) {
        Bank bank = new Bank();
        ATMSystem atmSystem = new ATMSystem(bank);

        // Dummy data untuk pengujian
        Akun account1 = new Akun("1001", "223344", UserType.USER);
        account1.deposit(1000.0);
        Kartu card1 = new Kartu("8761908146718471", "10/25", "983");
        account1.setCard(card1);
        
        Akun account2 = new Akun("1002", "110022", UserType.ADMIN);
        account2.deposit(2000.0);
        Kartu card2 = new Kartu("2516789172656175", "11/25", "989");
        account2.setCard(card2);

       Akun account3 = new Akun("1003", "112233", UserType.USER);
        account3.deposit(5000.0);
        Kartu card3 = new Kartu("8761908146718471", "10/25", "983");
        account3.setCard(card1);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        ATM atm = new ATM(atmSystem);

        // Pilih akun yang akan digunakan
        System.out.println("Pilih akun:");
        System.out.println("1. Login Sebagai USER");
        System.out.println("2. Login Sebagai ADMIN");
        System.out.print("Masukkan pilihan Anda: ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Uji coba penggunaan ATM untuk akun USER 1
                atm.insertCard(card1); // Contoh log masuk
                break;
            case 2:
                // Uji coba penggunaan ATM untuk akun ADMIN 
                atm.insertCard(card2); // Contoh log masuk
                break;
             case 3:
                // Uji coba penggunaan ATM untuk akun USER 2
                atm.insertCard(card3); // Contoh log masuk
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        // Tutup scanner setelah digunakan
        scanner.close();
    }
}

