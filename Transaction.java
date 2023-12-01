/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Dimas Rachmat Rizki_630
 */
package uas_projek_pbo;
import java.util.Date;

// Class untuk merepresentasikan transaksi
public class Transaction {
    private Date date;
    private double amount;
    private TransactionType type;

    public Transaction(double amount, TransactionType type) {
        this.date = new Date();
        this.amount = amount;
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public TransactionType getType() {
        return type;
    }
}
