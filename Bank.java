/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Dimas Rachmat Rizki_630
 */
package uas_projek_pbo;
import java.util.ArrayList;
import java.util.List;

// Class untuk merepresentasikan bank
public class Bank {
    private List<Akun> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Akun account) {
        accounts.add(account);
    }

    public Akun getAccountByCard(String cardNumber) {
        for (Akun account : accounts) {
            if (account.getCard().getCardNumber().equals(cardNumber)) {
                return account;
            }
        }
        return null;
    }

    public List<Akun> getAllAccounts() {
        return accounts;
    }

    public void showAllCustomerInfo() {
        for (Akun account : accounts) {
            System.out.println("Nomor Rekening: " + account.getAccountNumber() +
                    ", Saldo: $" + account.getBalance() +
                    ", Tipe Pengguna: " + account.getUserType());
        }
    }
}
